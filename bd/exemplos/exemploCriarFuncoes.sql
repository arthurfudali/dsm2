create database sistemaVendaLivros;
use sistemaVendaLivros;

create table autores(
idAutor int auto_increment primary key,
nome varchar (255),
pais varchar(50)
);
create table livros(
idLivro int auto_increment primary key,
titulo varchar(255),
idAutor int,
preco decimal(10,2),
estoque int default 0,
constraint fk_idAutor_livros foreign key(idAutor) references autores(idAutor)
);
create table vendas (
idVenda int auto_increment primary key,
idLivro int,
dataVenda date,
quantidade int,
constraint fk_idLivro_vendas foreign key(idLivro) references livros(idLivro)
);
insert into autores(nome,pais) values
('Machado de Assis', 'Brasil'),
('Clarice Lispector', 'Brasil'),
('Jorge Amado', 'Brasil');
insert into livros (titulo,idAutor,preco,estoque) values 
('Dom Casmurro',1,34.90,12),
('A hora da estrela',2,29.90,7),
('Capitães de Areia',3,39.90,9);
alter table vendas add column valorTotal decimal(10,2);
insert into vendas (idLivro, dataVenda, quantidade, valorTotal) values
(1,'2024-09-01', 3, 104.78),
(2,'2024-09-02', 2, 59.80);

#Criar funções
#mudar Delimitador mySQL:
Delimiter //

create function totalVendas() returns decimal (10,2)
begin #abre a função

#para declarar a variavel e necessario o tipo e o dado que ela recebe
declare total decimal(10,2); #por estar dentro da função usa-se o ;

select sum(valorTotal) into total from vendas; #pega a soma do valor total dentro da variavel 'total' da tabela 'vendas'
return ifnull(total,0);

end // #Fecha a função e termina com //

#Fecha o delimiter
Delimiter ;
select * from vendas;

SELECT TOTALVENDAS();

Delimiter //

Create function calculaVenda (id int, qtd int) returns decimal(10,2)
begin
declare valorTotal decimal(10,2);
declare precoUnit decimal(10,2);
SELECT 
    preco
INTO precoUnit FROM
    livros
WHERE
    livros.idLivro = id
LIMIT 1;
if precoUnit is null then
return 0;
end if;
set valorTotal = precoUnit* qtd;
return valorTotal;
end//
delimiter ;

SELECT CALCULAVENDA(3, 3);

delimiter //
create function calculaEstoque (id int, qtd int) returns decimal(10,2)
begin
	declare estoqueAtual int;
    declare estoqueAtualizado int;
    
    select estoque into estoqueAtual from livros where idLivro = id limit 1;
    set estoqueAtualizado = estoqueAtual-qtd;
    return estoqueAtualizado;
end //

delimiter ;

# essas funções apenas fazem a lógica, nada disso realmente é alterado no BD, quem faz isso são as procedures:

# PROCEDURE: 
# Registrar venda:
delimiter //

create procedure registraVenda(in id int, in qtd int)
begin

	declare valorTotal decimal(10,2);
    set valorTotal =  calculaVenda(id,qtd);
    insert into Vendas (idLivro, dataVenda, quantidade, valorTotal) values
    (id, curdate(), qtd, valorTotal);

end //

delimiter ;
select * from vendas;
#executar procedure
call registraVenda(3,2);
delimiter //
create procedure atualizaEstoque(in id int, in qtd int)
begin
	declare estoqueNovo int;
    set estoqueNovo = calculaEstoque(id, qtd);
	update livros set estoque = estoqueNovo where idLivro = id;
end //
delimiter ;
use sistemavendalivros;
select * from livros;
call atualizaEstoque(1,1);

delimiter //

# criar trigger
create trigger vender
after insert on vendas 
for each row
begin

	call atualizaEstoque(new.idLivro, new.quantidade);

end//

delimiter ;

select * from livros;
select * from vendas;

call registraVenda(1,8);

# criar VIEW de listagem de vendas
# a VIEW é um 'apelido' para uma query;

create view listaVendas as select idVenda, vendas.idLivro, livros.titulo, quantidade, valorTotal from vendas join livros on vendas.idLivro = livros.idLivro; #join e inner join funcionam igual
select * from listaVendas;

