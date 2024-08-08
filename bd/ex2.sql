create database DepFuncionarios;
use DepFuncionarios;
create table departamentos(
dptoId int auto_increment primary key,
dptoNome varchar(100)
);
create table funcionarios(
funcId int auto_increment primary key,
nome varchar(100),
cargo varchar(50),
dtContrato date,
salario double (8,2),
departamento int, #a coluna que vai virar chave estrangeira
constraint fk_depto /*nome q a chave vai receber */ foreign key (departamento) references departamentos(dptoId)
);	

