#Criação de banco de dados caso não exista
create database if not exists emptech_ArthurFudali;
#apontar o banco para o uso
use emptech_ArthurFudali;
#Criação de tabelas
create table if not exists funcionarios
(
codFunc int auto_increment primary key,
nomeFunc varchar(255)not null
);

create table if not exists veiculos
(
codVeic int auto_increment primary key,
modelo varchar(255) not null,
placas varchar(20) not null,
codFunc int
);

#inserindo dados nas tabelas
insert into funcionarios(nomeFunc) values
('João Silva'), ('Maria Oliveira'), ('Pedro Santos'),
('Ana Costa'),('Lucas Almeida'),('Fernana Lima'),('Arthur Fudali'),('Amanda Costa'),('Lucas Miura');
drop table funcionarios;

insert into veiculos (Modelo, Placas, codFunc) values
('Fiat Uno','ABC1D23',1),('Honda Civic','XYZ2E34',1),
('Toyota Corolla','LMN3F45',2),('Chevrolet Onix','OPQ4g56',3),
('VW Gol','UVW6I78',5),('Peugeot 208','YZA7j89',null), ('Honda Accord', 'TAS89J', 7), ('VW Fusca', 'AAAaAS12', 8), ('Mistsubishi Colt', 'AAABB09', 9);

#Inner Join
select funcionarios.nomeFunc as Nome, veiculos.modelo from veiculos
join funcionarios on veiculos.codFunc = funcionarios.codFunc;

#Equi Join
select f.nomeFunc as Nome, v.modelo from veiculos v 
join funcionarios f using (codFunc);

#Left Join
/*Retorna todos os campos do lado esquerdo do Join que se relaciona
com o lado direito do join, mais os os registros que não relacionam
com o lado direito e que sejam do lado esquerdo. */

select f.nomeFunc as Nome, v.modelo from veiculos v
left join funcionarios f using (codFunc);

#Rigth Join
/*Retorna todos os campos do lado direito do Join que se relaciona
com o lado esquerdo do join, mais os os registros que não relacionam
com o lado esquerdo e que sejam do lado direito. */

select f.nomeFunc as Nome, v.modelo from veiculos v
right join funcionarios f using (codFunc);

#full join
/*O Full Join não funciona para mySQL, porem uma solução para
obeter o resultado de uma tabela contendo, dados que se relacionam
ou não do lado esquerdo com o lado direito do join, mais os dados que 
se relacionam ou não do lado direito com o lado esquerdo do join, é
necessário que seja feito as query Left Join e Rigth Join, porem 
utilizando o UNION para unir as 02 querys para realizar a 
pesquisa.*/

select f.nomeFunc as Nome, v.modelo from veiculos v
left join funcionarios f using (codFunc)
union
select f.nomeFunc as Nome, v.modelo from veiculos v
right join funcionarios f using (codFunc);

/* View - Estrutura de seleção que encapsula querys complexas para 
simplificar o uso ao usuario e facilitar as chamadas em aplicações
externas. */

create view func_Veic as
select f.nomeFunc as Nome, v.modelo from veiculos v
left join funcionarios f using (codFunc)
union
select f.nomeFunc as Nome, v.modelo from veiculos v
right join funcionarios f using (codFunc);

#chamando view
select * from func_veic;

create table atuacaoVendas
(
codAtuacao int auto_increment primary key,
descricao varchar(255) not null,
codFunc int,
foreign key (codFunc) references funcionarios(codFunc)
);
drop table atuacaovendas;

insert into atuacaoVendas (descricao, codFunc) values
('Vendas de Veiculos Novos', 1), ('Vendas de Veiculos Usados', 2),
('Manutenção e reparo de veiculos', 3),('Serviços de Pós-Vendas', 4),
('Consultoria de Vendas', 5),('Programações e eventos especiais', 6),('Fincanciamento de veiculos', 7), ('Adicao de seguro', 8), ('Vendas de veiculos recuperados', 9);


select f.codFunc, f.nomeFunc, v.Modelo, v.Placas, a.descricao
from funcionarios f
cross join veiculos v
cross join atuacaoVendas a;

create table indicacoes
(
codIndicador int,
codIndicado int,
primary Key (codIndicador,CodIndicado),
foreign key (codIndicador) references Funcionarios(codFunc),
foreign key (codIndicado) references Funcionarios(codFunc)
);

insert into indicacoes (codIndicador,codIndicado) values
(1,2),(1,3),(2,4),(2,5),(4,6),(6,7),(7,8),(8,9);

select i1.codIndicador as 'ID Indicador', f1.nomeFunc as 'Nome Indicador',
i1.codIndicado as 'ID Indicado', f2.nomeFunc as 'Nome Indicado' from indicacoes i1
join funcionarios f1 on i1.codIndicador = f1.codFunc
join funcionarios f2 on i1.codIndicado = f2.codFunc;

# --- ATIVIDADE ---
# Crie uma função chamada `GetFuncionarioVeiculoCount` que recebe o
#código de um funcionário e retorna o número de veículos associados a esse
#funcionário.

delimiter //
create function getFuncionarioVeiculoCount(id int) returns int
begin
		declare veiculos int;
		SELECT COUNT(*) into veiculos FROM veiculos v  WHERE v.codFunc = id;
        return ifnull(veiculos,0);
end //
delimiter ;
drop function getFuncionarioVeiculoCount;
select getFuncionarioVeiculoCount(1) as 'Qtd veiculos';

# Crie um procedimento armazenado chamado `AddVenda` que insere uma nova atuação de vendas na tabela `AtuacaoVendas`. O procedi1mento deve receber uma descrição e adicionar a nova atuação de vendas.
delimiter //

create procedure addVenda(in des varchar(255))
begin

	insert into atuacaovendas(descricao) values (des);

end //
delimiter ;
call addVenda('teste');
select * from atuacaovendas;
delete from atuacaovendas where codatuacao =11;

# Crie um gatilho chamado `BeforeInsertIndicacao` que verifica se o funcionário indicado já foi indicado por outro funcionário. Se o funcionário já tiver uma indicação, o gatilho deve lançar um erro e impedir a inserção.

DELIMITER //

CREATE TRIGGER VerificarIndicacaoAntesInsercao
BEFORE INSERT ON indicacoes
FOR EACH ROW
BEGIN
    IF exists 
    (select 1 from indicacoes where codIndicado = new.codIndicado)
    THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'O funcionário indicado já possui uma indicação anterior.';
    END IF;
END //

DELIMITER ;

select * from indicacoes;
insert into indicacoes (codIndicador, codIndicado) values (3,2);

#3) 

select * from atuacaoVendas;
select * from funcionarios;
select * from veiculos;


create view funcionarioVeiculoAtuacao as select f.codFunc, f.nomeFunc ,v.modelo, v.placas, d.descricao from funcionarios f 
join veiculos v  on f.codFunc = v.codFunc inner join atuacaoVendas d where f.codFunc = d.codFunc; 
select * from funcionarioVeiculoAtuacao;

#b) 

select f.nomeFunc ,v.modelo, d.descricao from funcionarios f left join veiculos v  on f.codFunc = v.codFunc left join atuacaoVendas d on f.codFunc = d.codFunc; 
