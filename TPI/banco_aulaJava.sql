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