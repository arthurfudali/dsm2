create database biblioteca;
use biblioteca;

create table livros (
codLivro int auto_increment primary key,
ISBN int (13),
titulo varchar (255),
subtitulo varchar (255),
anoPublicacao int (4),
genero varchar (100),
descricao varchar (255)
);

create table autores (
codAutor int auto_increment primary key,
nomeCompleto varchar(255),
dt_nasc date,
biografia varchar(255)
);

create table livrosXautores (
idx int auto_increment primary key,
cod_livro int,
cod_autor int,
constraint fk_codLivro foreign key (cod_livro) references livros(codLivro),
constraint fk_codAutor foreign key (cod_autor) references autores(codAutor)
);

create table usuarios (
codUsuario int auto_increment primary key,
nomeCompleto varchar (255),
endereco varchar (255),
bairro varchar (100), 
cidade varchar (100),
estado varchar (2)
);

alter table usuarios add column assinatura enum("Aluno", "Professor", "Funcionario") default "Aluno";
insert into usuarios (nomeCompleto, assinatura) values ("Luiz Cláudio", "Professor");
select * from usuarios; 
alter table usuarios change assinatura assinatura enum("Aluno", "Professor", "Funcionario", "Diretor");




create table usuariosXtelefone (
idx int auto_increment primary key,
idUsuario int,
telefone int (11),
constraint fk_idUsuario_tel foreign key (idUsuario) references usuarios(codUsuario)
);

create table usuariosXemails (
idx int auto_increment primary key,
idUsuario int,
email varchar (255),
constraint fk_idUsuario_emails foreign key (idUsuario) references usuarios(codUsuario)
);

create table emprestimos (
codEmprestimos int auto_increment primary key,
dtEmprestimo date not null,
dtPrevistaDev date not null,
dtRealDev date,
idUsuario int,
constraint fk_idUsuario_emp foreign key (idUsuario) references usuarios(codUsuario)
);

create table emprestados (
idx int auto_increment primary key,
idLivro int,
codEmprestimo int,
constraint fk_idLivro_emprestado foreign key(idLivro) references livros(codLivro),
constraint fk_codEmp_emprestado foreign key(codEmprestimo) references emprestimos(codEmprestimos)
);

insert into livros (ISBN, titulo, subtitulo, anoPublicacao, genero, descricao) values
(9780140449136, 'A Odisséia', 'Traduzido por: João Pereira', 800, 'Épico', 'A história épica 
de Odisseu e sua jornada de volta para casa.' ),

(9780321125217, 'Clean Code', 'A Handbook of Agile Software Craftsmanship', 2008 , 'Tecnologia', 
'Conselhos e melhores práticas para escrever código limpo e manutenível.'),

(9780201616224, 'Design Patterns', 'Elements of Reusable Object-Oriented Software', 1994, 
'Tecnologia', 'Padrões de design de software e suas aplicações em programação orientada a 
objetos.' );
select * from livros;

insert into autores (nomeCompleto, dt_nasc, biografia) values
('Homero', '0800-01-01', 'Poeta grego da Antiguidade, autor da Ilíada e da Odisséia.'),
('Robert C. Martin', '1952-12-05', 'Engenheiro de software e autor conhecido por seu trabalho 
em princípios de design de software.'),
('Erich Gamma', '1960-03-22', 'Um dos autores do famoso livro "Design Patterns", professor e consultor em design de software.');
select * from autores;

insert into livrosXautores (cod_livro, cod_autor) values
(1,1), 
(2,2),
(3,3);

insert into usuarios (nomeCompleto, endereco, bairro, cidade, estado, assinatura) values
('Ana Silva', 'Rua das Flores, 123', 'Jardim Primavera', 'São Paulo', 'SP', 'Aluno'),
('João Souza', 'Avenida Central, 456', 'Centro', 'Rio de Janeiro', 'RJ', 'Professor'),
('Maria Oliveira', 'Praça da Liberdade, 789', 'Liberdade', 'Belo Horizonte', 'MG', 'Funcionario');

insert into usuariosXtelefone (idUsuario, telefone) values
(1,11987654321),
(2, 21987654321 ),
(3, 31987654321);

select * from usuariosXtelefone;

insert into usuariosXemails (idUsuario, email) values
(1, 'ana.silva@example.com'),
(2, 'joao.souza@example.com'),
(3, 'maria.oliveira@example.com');

insert into emprestimos (dtEmprestimo, dtPrevistaDev, dtRealDev, idUsuario) values
('2024-08-01', '2024-08-15', NULL, 1),
('2024-08-05', '2024-08-20', NULL, 2),
('2024-08-10', '2024-08-25', NULL, 3);

insert into emprestados (idLivro, codEmprestimo) values 
(1,1),
(2,2),
(3,3);


#1. Listar todos os livros disponíveis na biblioteca
select * from livros;

#2. Encontrar todos os autores que têm mais de 50 anos
select * from autores where codAutor=1;
select * from autores where codAutor=2;
select * from autores where codAutor=3;

#3. Mostrar todos os usuários que têm assinatura de 'Professor'
select * from usuarios where codUsuario=3;
select * from usuarios where codUsuario=5;

#4. Listar todos os emprestimos que ainda não foram devolvidos.
select * from emprestimos where codEmprestimos=1;
select * from emprestimos where codEmprestimos=2;
select * from emprestimos where codEmprestimos=3;


#5. Exibir todos os livros junto com os nomes dos autores que os escreveram.



