const filmes = [
  {
    titulo: "Get Out",
    diretor: "Jordan Peele",
    duracao: "104 min",
    lancamento: 2017,
  },
  {
    titulo: "Kill Bill: Vol. 1",
    diretor: "Quentin Tarantino",
    duracao: "111 min",
    lancamento: 2003,
  },
  {
    titulo: "Fallen Angels",
    diretor: "Wong Kar-Wai",
    duracao: "98 min",
    lancamento: 1995,
  },
  {
    titulo: "Tenet",
    diretor: "Christopher Nolan",
    duracao: "150 min",
    lancamento: 2020,
  },
];
filmes.forEach((filme) => {
  console.log(filme.titulo),
    console.log(filme.diretor),
    console.log(filme.duracao),
    console.log(filme.lancamento),
    console.log();
});
