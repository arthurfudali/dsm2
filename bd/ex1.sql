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



create table disciplinas(
idDisc int auto_increment primary key,
nomeDisc varchar(100)
);
insert into disciplinas (nomeDisc) values
("Banco de dados relacional"),
("Desenvolvimento web II"),
("Design digital");

create table matricula(
idMatricula int auto_increment primary key,
idAluno int,
idDisciplina int,
#criar FK
constraint fk_alunoDisciplina foreign key (idAluno) references alunos(id),
foreign key (idDisciplina) references disciplinas(idDisc)
);

