import express from "express";
const app = express();
const port = 8080;
import filmesController from "./controllers/filmesController.js"; //não esquecer do .js
import connection from "./config/sequelize-config.js";

app.set("view engine", "ejs");
app.use(express.static("public"));
app.use(express.urlencoded({extended: false}));


app.use("/", filmesController);


connection.authenticate().then(()=>{
    console.log("Conexao com sucesso");
}).catch(error=>{
    console.log(error);
})
connection.query(`CREATE DATABASE IF NOT EXISTS filmes;`).then(()=>{
    console.log("query executada com sucesso");
}).catch(error=>{
    console.log(error);
})
app.listen(port, (error) => {
  if (error) {
    console.log("Erro ao iniciar o servidor: " + error);
  } else {
    console.log("Servidor rodando em http://localhost:" + port);
  }
}); 