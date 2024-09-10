create database emptech;
use emptech;
create table funcionarios(
idFunc int auto_increment primary key,
nomeFunc varchar(255) not null
);
create table veiculos(
idVeic int auto_increment primary key,
modelo varchar(255) not null,
placas varchar (50) not null,
idFunc int
);


insert into funcionarios (nomeFunc) values 
('joao Silva'), ('Maria Oliveira'), ('Pedro Santos'), ('Ana Costa');

insert into veiculos (Modelo, Placas , idFunc) values
('Fiat Uno', 'ABC1D23', 1), ('Honda Civic', 'XYZ2E34', 1), ('Toyota Corolla', 'LMN3F45', 2);
insert into veiculos (Modelo, Placas , idFunc) values
('gol', 'abc1234', null);

# INNER JOIN
select funcionarios.nomefunc as Nome, veiculos.modelo from veiculos join funcionarios on veiculos.idFunc = funcionarios.idFunc;

# EQUI JOIN	-> da pra usar quando a FK tiver o mesmo nome da PK que for usada, assim como no exemplo acima
select f.nomefunc as nome, v.modelo from veiculos v join funcionarios f using (idfunc);  # o 'using' substitui:  'on v.idfunc = f.idfunc' ja que os nomes sao iguais

# LEFT JOIN -> retorna todos os campos do lado esquerdo que se relacionam com os do lado direito, ou seja, só os campos que são associados, mais os registros que não se relacionam mais pertencem ao lado esquerdo.
# nesse caso, a 'esquerda' se refere a esquerda do join na query, ou seja, 'veiculos'
# o retorno é todos os veiculos, inclusive aqueles que não tem dono
select v.modelo, f.nomefunc as nome from veiculos v left join funcionarios f using (idfunc);

# RIGHT JOIN -> mesma coisa do left, mas nesse caso retorna como prioridade aqueles a direita do join, nesse caso funcionarios, então o retorno são todos os funcionarios mesmo aqueles que não tem veículos.
select f.nomefunc as nome, v.modelo from veiculos v right join funcionarios f using (idfunc);

# FULL JOIN -> 
select f.nomefunc as nome, v.modelo from veiculos v left join funcionarios f using (idfunc)
union
select f.nomefunc as nome, v.modelo from veiculos v right join funcionarios f using (idfunc);

create view listaCarros as select f.nomefunc as nome, v.modelo from veiculos v left join funcionarios f using (idfunc)
union
select f.nomefunc as nome, v.modelo from veiculos v right join funcionarios f using (idfunc);


select * from listaCarros;

create table atuacaoVendas(
idAtuacao int auto_increment primary key,
descricao varchar (255) not null
);
insert into atuacaovendas (descricao) values 
('Vendas de veiculos novos'),('Venda de veiculos usados'), ('manutencao e reparo'),('Sevico de pos venda'),('Consultoria de vendas'),('programacao e eventos especiais');


# CROSS JOIN
# esse join cria relatorios onde ira fazer todas as combinacoes possiveis entre as tabelas

select f.idfunc, f.nomefunc, v.modelo, v.placas, a.descricao from funcionarios f cross join veiculos v cross join atuacaovendas a;

create table indicacoes(
idIndicador int,
idIndicado int,
primary key (idIndicador, idIndicado), foreign key (idIndicador) references funcionarios(idFunc), foreign key (idindicado) references funcionarios(idfunc)
);
insert into indicacoes (idindicador, idindicado) values
(1,2), (1,3), (2,4);

# SELF JOIN
# Gera um relacionamento de dados de uma tabela com ela mesma

select i1.idIndicador as 'id indicador', f1.nomefunc as 'nome indicador', i1.idIndicado as 'id indicado', f2.nomefunc as 'nome indicado' from indicacoes i1 
join funcionarios f1 on i1.idindicador = f1.idfunc
join funcionarios f2 on i1.idindicado = f2.idfunc;