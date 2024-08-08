create database produtosgarantias;
use produtosgarantias;
create table produto(
	prodId int primary key auto_increment,
    nome varchar(100),
    email varchar(100),
    senha varchar(50)
);
create table garantia(
	garantId int primary key auto_increment,
    garantTipo varchar(50),
    dataInicio date,
    dataFim date,
    termos varchar (200)
);
