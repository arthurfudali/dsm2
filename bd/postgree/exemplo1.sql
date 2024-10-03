create table autores(
	autor_id serial PRIMARY KEY, -- serial é o mesmo que INT AUTO INCREMENT
	nome varchar(100)
);
create table livros (
	livro_id serial PRIMARY KEY,
	titulos varchar(150),
	autor_id int references autores(autor_id) on delete cascade,
	estoque int check(estoque>=0 ), --Valida que o estoque não pode ser negativo
	ano_publicacao int,
	isbn varchar(13) unique --Determina que o registro será unico
);
create table membros(
	membro_id serial primary key,
	nome varchar(100),
	endereco varchar(100),
	email varchar(100),
	data_cadastro date default CURRENT_DATE
);
create table emprestimos(
	emprestimo_id serial PRIMARY KEY,
	livro_id int references livros(livro_id), 
	membro_id int references membros(membro_id), 
	data_emprestimo date default CURRENT_DATE,
	data_devolucao date,
	devolvido boolean DEFAULT false,
	data_prevista_devolucao date
);
create table reservas(
	reserva_id serial PRIMARY KEY,
	livro_id int REFERENCES livros(livro_id),
	membro_id int REFERENCES membros(membro_id),
	data_reserva date DEFAULT CURRENT_DATE
);
create table multas(
	multa serial PRIMARY KEY,
	emprestimo_id int REFERENCES emprestimos(emprestimo_id), 
	valor numeric(5,2),
	pago boolean DEFAULT false
);

-- procedures e triggers: gerar multas automaticamente para livros entregues com atraso

-- procedure para calcular a multa
CREATE OR REPLACE FUNCTION gerarMulta() RETURNS TRIGGER AS $$ -- faz o papel do delimiter
BEGIN
	IF new.devolvido = true and new.data_devolucao > new.data_prevista_devolucao 
	THEN --calcular valor da multa como 1.50 por dia
	INSERT into multas(emprestimo_id, valor) VALUES
	(new.emprestimo_id, (new.data_devolucao - new.data_prevista_devolucao) *1.50);
	END IF;
	RETURN NEW;
END;
$$ language plpgsql; --volta a linguagem do postgreeSQL

-- trigger para chamar a procedure de multa ao devolver o livro
create trigger triggerGerarMulta
after update of devolvido on emprestimos
for each row
when (new.devolvido=true)
execute function gerarMulta();

create function registraEmprestimo() returns trigger as $$
	declare novoestoque int;
	begin
		select estoque into novoestoque from livros where livro_id = new.livro_id;
		update livros set estoque = (estoque - 1)
		where livro_id = new.livro_id;
		return new;
	end;
$$ language plpgsql;
drop function registraEmprestimo();

create trigger triggerBaixaEstoque
	after insert on emprestimos
	for each row
	when (new.devolvido = false)
	execute function registraEmprestimo();

drop trigger triggerBaixaEstoque on emprestimos;

create function registraDevolucao() returns trigger as $$
	declare novoestoque int;
	begin
		select estoque into novoestoque from livros where livro_id = new.livro_id;
		update livros set estoque = (estoque + 1)
		where livro_id = new.livro_id;
		return new;
	end;
$$ language plpgsql;

create trigger devolucao
	after update of devolvido on emprestimos
	for each row
	when (new.devolvido = true)
	execute function registraDevolucao();




select * from emprestimos;

select * from multas;

select * from livros;


--VIEW PARA LISTRAR MEMROS COM EMPRESTIMOS EM ATRASO
create view membrosEmAtraso as
select m.membro_id, m.nome, e.data_prevista_devolucao
from membros m
join emprestimos e using (membro_id)
where e.devolvido = false and e.data_prevista_devolucao < CURRENT_DATE;

-- indice para acelerar consultas por titulo de livro
create index idx_livros_titulo on livros(titulo);

-- populando o BD
insert into autores(nome) values
('J.K Rowling'),
('George R.R. Martin'),
('J.R.R. Tolkien');

insert into livros (titulos, autor_id, estoque, ano_publicacao, isbn) values
('Harry Potter e a Pedra Filosofal', 1, 5, 1997, '98076127381'),
('Game of Thrones', 2, 3, 1996, '90742139412'),
('O Senhor dos Aneis', 3, 4, 1954, '9803124321');

insert into membros(nome, endereco, email) values
('Joao Silva', 'Rua das flores, 123', 'joao@email.com'),
('Maria Souza', 'Av. Brasil, 123', 'maria@email.com');

insert into emprestimos (livro_id, membro_id, data_prevista_devolucao) values
(1,1,'2024-10-08');
insert into emprestimos (livro_id, membro_id, data_prevista_devolucao) values
(2,2,'2024-10-08');
insert into emprestimos (livro_id, membro_id, data_prevista_devolucao) values
(3,2,'2024-10-08');

select * from livros;
select * from autores;
select * from membros;
select * from emprestimos;
select * from multas;

