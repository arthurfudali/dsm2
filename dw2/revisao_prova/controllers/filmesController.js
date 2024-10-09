import express from "express";
const router = express.Router();
import filmes from "../models/filmes.js";

router.get("/", (req, res) => {
    filmes.findAll().then((filmes)=>{
        
        res.render("filmes",{
            filmes: filmes,
        });

    }).catch(error=>{
        console.log(error);
    })
  });

router.post("/filmes/new", (req,res)=>{
    const titulo = req.body.titulo
    const genero = req.body.genero
    const duracao = req.body.duracao
    filmes.create({
        titulo: titulo,
        genero: genero,
        duracao: duracao
    }).then(()=>{
        res.redirect("/")
    }).catch(error=>{
        console.log(error)
    })
});
router.get("/filmes/delete/:id", (req,res)=>{
    const id = req.params.id
    filmes.destroy({
        where:{
            id:id
        }
    }).then(()=>{
        res.redirect("/")
    }).catch(error=>{
        console.log(error);
    })
})
  export default router //importante não esquecer