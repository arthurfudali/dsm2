create table gatos(
	idGato serial PRIMARY KEY,
	nome varchar(100),
	raca varchar(100),
	coloracao varchar(50),
	idade int,
	brinquedoFav varchar(100)
);
drop table gatos;
insert into gatos(nome, raca, coloracao, idade, brinquedoFav ) values
('Mickey', 'Maine Coon', 'Multicor', 3, 'Bolinha vermelha'),
('Nine', 'Ragamuffin', 'Bege', 2, 'Bolinha verde'),
('Carmen', 'Persian', 'Marrom', 2, 'Ratinho de borracha'),
('Luna', 'Abyssinian', 'Multicor', 12, 'Bolinha de papel'),
('Bella', 'Siamese', 'Laranja', 15, 'Arranhador'),
('Simba', 'Bengal', 'Amarelo com manchas', 5, 'Corda'),
('Nina', 'Sphynx', 'Pele nua', 4, 'Bolinha de lã'),
('Zorro', 'Persian', 'Cinza', 10, 'Ratinho de borracha'),
('Chester', 'British shorthair', 'Cinza', 7, 'Pneu de borracha'),
('Tina', 'Maine Coon', 'Branco e Preto', 8, 'Peixe de borracha');

select * from gatos;

create view view_media_idade_gatos as
select raca as "Raça", count(*) as "Quantidade de Gatos", avg(idade) as "Media de Idade" from gatos
group by raca order by avg(idade) desc;
select * from view_media_idade_gatos;

create view nome_idade_brinquedos as
select nome as "Nome", idade as "Idade" from gatos where brinquedoFav in ('Ratinho de borracha', 'Bolinha de lã') 
and idade > (select avg(idade) from gatos);
select * from nome_idade_brinquedos;

create view nome_idade_maior5_ratinho as
select nome, idade from gatos where idade>5 and brinquedoFav = 'Ratinho de borracha' order by idade desc;
select * from nome_idade_maior5_ratinho;