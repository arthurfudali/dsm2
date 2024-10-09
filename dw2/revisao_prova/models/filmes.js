import { Sequelize } from "sequelize";
import connection from "../config/sequelize-config.js";
const filmes = connection.define("filmes",{//define cria a table
    titulo:{
        type: Sequelize.STRING,
        allowNull: false,
    },
    genero: {
        type: Sequelize.STRING,
        allowNull: false,
    },
    duracao: {
        type: Sequelize.INTEGER,
        allowNull: false,
    },

});
filmes.sync({ force: false});
export default filmes;