use biblioteca;
create table emprestimos (
idEmprestimo int primary key auto_increment,
dataEmprestimo date not null,
devolPrevista date not null,
devolReal date,
idUsuario int,
constraint fk_id_usuario foreign key (idUsuario) references usuarios(idUsuario)
);
create table emprestimosXlivros (
idx int primary key auto_increment,
idLivro int,
idEmprestimo int, 
constraint fk_id_livro foreign key (idLivro) references livros(idLivro),
constraint fk_id_emprestimo foreign key (idEmprestimo) references emprestimos(idEmprestimo)
);
# inserção de valores de livros
INSERT INTO livros (ISBN, titulo, subTitulo, anoPublicacao, genero, descricao)
VALUES
(9780140449136, 'A Odisséia', 'Traduzido por: João Pereira', 800, 'Épico', 'A história épica de
Odisseu e sua jornada de volta para casa.'),
(9780321125217, 'Clean Code', 'A Handbook of Agile Software Craftsmanship', 2008,
'Tecnologia', 'Conselhos e melhores práticas para escrever código limpo e manutenível.'),
(9780201616224, 'Design Patterns', 'Elements of Reusable Object-Oriented Software', 1994,
'Tecnologia', 'Padrões de design de software e suas aplicações em programação orientada a
objetos.');
-- Inserção de autores
INSERT INTO autores (nomeCompleto, dataNasc, biografia)
VALUES
('Homero', '0800-01-01', 'Poeta grego da Antiguidade, autor da Ilíada e da Odisséia.'),
('Robert C. Martin', '1952-12-05', 'Engenheiro de software e autor conhecido por seu trabalho
em princípios de design de software.'),
('Erich Gamma', '1960-03-22', 'Um dos autores do famoso livro "Design Patterns", professor e
consultor em design de software.');
-- Inserção de livrosXautores
INSERT INTO livrosXautores (idLivro, idAutor)
VALUES
(1, 1), -- A Odisséia por Homero
(2, 2), -- Clean Code por Robert C. Martin
(3, 3); -- Design Patterns por Erich Gamma
-- Inserção de usuários
INSERT INTO usuarios (nome, endereco, bairro, cidade, estado, assinatura)
VALUES
('Ana Silva', 'Rua das Flores, 123', 'Jardim Primavera', 'São Paulo', 'SP', 'Aluno'),
('João Souza', 'Avenida Central, 456', 'Centro', 'Rio de Janeiro', 'RJ', 'Professor'),
('Maria Oliveira', 'Praça da Liberdade, 789', 'Liberdade', 'Belo Horizonte', 'MG', 'Funcionario');
-- Inserção de usariosXtelefones
INSERT INTO usuariosxtelefone (idUsuario, telefone)
VALUES
(1, 11987654321),
(2, 21987654321),
(3, 31987654321);
-- Inserção de usuariosXemails
INSERT INTO usuariosxemail (idUsuario, email)
VALUES
(1, 'ana.silva@example.com'),
(2, 'joao.souza@example.com'),
(3, 'maria.oliveira@example.com');
-- Inserção de emprestimos
INSERT INTO emprestimos (dataEmprestimo, devolPrevista, devolReal, idUsuario)
VALUES
('2024-08-01', '2024-08-15', NULL, 1),
('2024-08-05', '2024-08-20', NULL, 2),
('2024-08-10', '2024-08-25', NULL, 3);
-- Inserção de emprestados
INSERT INTO emprestimosxlivros (idLivro, idEmprestimo)
VALUES
(1, 1), -- A Odisséia emprestado no empréstimo 1
(2, 2), -- Clean Code emprestado no empréstimo 2
(3, 3); -- Design Patterns emprestado no empréstimo 3


#1. Listar todos os livros disponíveis na biblioteca.

select * from livros;

#2. Encontrar todos os autores que têm mais de 50 anos.

select * from autores ;

#3. Mostrar todos os usuários que têm assinatura de 'Professor'.

select * from usuarios where assinatura = 'professor';

#4. Listar todos os emprestimos que ainda não foram devolvidos.

select * from emprestimos where devolReal is null;

#5. Exibir todos os livros junto com os nomes dos autores que os escreveram.

select nomeCompleto, FLOOR(DATEDIFF(CURDATE(), dataNasc) / 365) as idade from autores where FLOOR(DATEDIFF(CURDATE(), dataNasc) / 365) > 50;

#6. Mostrar todos os empréstimos com o nome do usuário que fez o empréstimo e o título do livro emprestado.

#7. Listar todos os usuários e seus números de telefone.
#8. Mostrar todos os e-mails dos usuários que têm assinatura 'Funcionario'.
#9.Encontrar todos os livros publicados após 2000 e ordená-los pelo ano de publicação.
#10. Listar todos os autores cuja biografia contém a palavra 'design'.
#11. Mostrar os detalhes dos empréstimos que foram feitos por usuários da cidade 'São Paulo'.
#12.Contar o número de livros de cada gênero na biblioteca.
#13. Encontrar o autor com o maior número de livros na biblioteca.
#14. Mostrar todos os usuários que nunca fizeram um empréstimo.
#15.Listar os livros que foram emprestados, mas ainda não foram devolvidos.