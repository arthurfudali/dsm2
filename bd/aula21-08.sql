create database biblioteca;
use biblioteca;
CREATE TABLE livros (
    idLivro INT AUTO_INCREMENT PRIMARY KEY,
    ISBN INT(13),
    titulo VARCHAR(255),
    subtitulo VARCHAR(255),
    anoPublicacao INT(4),
    genero VARCHAR(100),
    descricao VARCHAR(100)
);
CREATE TABLE autores (
    idAutor INT AUTO_INCREMENT PRIMARY KEY,
    nomeCompleto VARCHAR(255),
    dataNasc DATE,
    biografia VARCHAR(255)
);
CREATE TABLE livrosXautores (
    idX INT PRIMARY KEY AUTO_INCREMENT,
    idLivro INT,
    idAutor INT,
    CONSTRAINT fk_idLivro FOREIGN KEY (idLivro)
        REFERENCES livros (idLivro),
    CONSTRAINT fk_idAutor FOREIGN KEY (idAutor)
        REFERENCES autores (idAutor)
);

CREATE TABLE usuarios (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    endereco VARCHAR(255),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(2)
);

CREATE TABLE usuariosXtelefone (
    idx INT AUTO_INCREMENT PRIMARY KEY,
    idUsuario INT,
    telefone INT(11),
    CONSTRAINT fk_idUsuario_tel FOREIGN KEY (idUsuario)
        REFERENCES usuarios (idUsuario)
);
CREATE TABLE usuariosXemail (
    idx INT AUTO_INCREMENT PRIMARY KEY,
    idUsuario INT,
    email VARCHAR(255),
    CONSTRAINT fk_idUsuario_emails FOREIGN KEY (idUsuario)
        REFERENCES usuarios (idUsuario)
);

alter table usuarios add column assinatura enum("aluno", "professor", "funcionario") default "aluno";
insert into usuarios (nome, assinatura) values ("Robson", "Diretor");
alter table usuarios change assinatura assinatura enum("aluno", "professor", "funcionario", "diretor") default "aluno";
CREATE TABLE categoriaUsuarios (
    idx INT AUTO_INCREMENT PRIMARY KEY,
    assinatura ENUM('aluno', 'professor', 'funcionario') DEFAULT 'aluno'
);