// Importar o express
const express = require("express"); //importação do tipo antiga, commonJS
// Criando uma instancia do express, nesse caso, sem usar o 'new'
const app = express();

// Criando a rota principal:
app.get("/", (req, res) => {
  res.send("<h1>Hello world! <br> tamojunto mané pprt</h1>");
});

// Rota perfil
// :nome é um parametro obrigatorio
app.get("/perfil/:nome", (req, res) => {
  const nome = req.params.nome;
  res.send("Perfil do usuário: " + nome);
});

// Rota de video
app.get("/videos", (req, res) => {
  res.send("Pagina de Videos:");
});

// Iniciando o servidor na porta 8080
app.listen(8080, (error) => {
  if (error) {
    console.log(`Ocorreu um erro: ${error}`);
  } else {
    console.log(`Servidor iniciado`);
  }
});
