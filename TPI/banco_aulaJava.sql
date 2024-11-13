create database aula_java;
use aula_java;
create table Cliente(
id int auto_increment primary key,
codigo int(5) not null,
nome varchar(80),
telefone varchar(25),
email varchar(120)
);
select * from cliente;
use aula_java;
CREATE TABLE `Usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `login` varchar(120) DEFAULT NULL,
  `senha` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
select * from usuario;
create table Produtos(
id int auto_increment primary key,
codigo int(5) not null,
nomeProduto varchar(100),
descricao varchar(200)
);
select * from produtos;


use aula_java;
create table usuario(
	id int primary key auto_increment,
    codigo int(4) not null,
    nome varchar(100),
    telefone varchar(16),
    login varchar(60),
    senha varchar(50)
);

create database javaCrud;
use javaCrud;
create table Produto( #codigo, nomeProduto e Descrição
	id int primary key auto_increment,
    codigo int(4) not null,
    nomeProduto varchar(100),
    descricao varchar(500)
);

create table vendas(
	id int primary key auto_increment,
    codigo int(4) not null,
    nomeVendedor varchar(100),
    nomeProduto varchar(100)
);
select * from vendas;

create database projetoClinica;
use projetoClinica;
create table usuario(
	id int primary key auto_increment,
    codigo int(4) not null,
    nome varchar(100),
    telefone varchar(16),
    login varchar(60),
    senha varchar(50)
);
create table pacientes(
	id int primary key auto_increment,
    codigoPaciente int(4) not null,
    nomePaciente varchar(100),
    endereco varchar(100),
    complemento varchar(100),
    rg varchar(12),
    cpf varchar(14),
    dataNasc varchar(10)
);
select * from pacientes;
select * from usuario;

create database crudfilmes;
use crudfilmes;
create table filmes(
id int primary key auto_increment,
codigo int,
titulo varchar(100),
genero varchar(50),
diretor varchar(100),
produtora varchar(50),
dataCompra varchar(10)
);

drop table filmes;