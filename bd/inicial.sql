create database bd_fatec;
use bd_fatec;
create table alunos (
id int primary key auto_increment,
nome varchar(100) not null,
nascimento date,
cpf varchar (14)
); /* o ideal é usar int por conta do espaço, mas pelo fator educacional será varchar msm */

insert into alunos (nome, cpf) values 
("Arthur", "123.123.123-85"),
("Éric", "123.123.123-01");

#exemplo selecionando tudo
Select * from alunos;

#exemplo com select especifico
select nome, cpf from alunos;

update alunos set cpf="123.123.123-20" where id=2;
