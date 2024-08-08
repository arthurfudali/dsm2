create database Logins;
use Logins;
create table usuarios(
userId int auto_increment primary key,
nome varchar(100),
email varchar(100),
senha varchar(100)
);
create table configContas(
configId int auto_increment primary key,
configIdioma varchar(100),
configTema varchar(100),
notificacao varchar(256)
);
