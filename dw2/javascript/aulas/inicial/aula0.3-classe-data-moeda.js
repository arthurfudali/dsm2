// CLASSE DATA E MOEDA
// um objeto literal é um objeto que não deriva de uma classe

class Carro {
  constructor(marca, modelo, ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }
  //metodos
  buzinar() {
    return "bebeeebeeop";
  }
}
// instanciando um objeto Carro:
const carroPopular = new Carro("Ford", "Focus", 2014);
const carroPopular2 = new Carro();
carroPopular2.marca = "Volkswagen";
carroPopular2.modelo = "Gol";
carroPopular2.ano = 1994;
console.log(carroPopular2);

const carroEsportivo = new Carro("Chevrolet", "Camaro", 2024);
console.log(carroEsportivo.marca, carroEsportivo.modelo, carroEsportivo.ano);

//DATAS NO JS
//criando uma instancia da classe DATE
const dataAtual = new Date();
const dia = dataAtual.getDate();
const month = dataAtual.getMonth() + 1;
console.log(`Hoje é dia ${dia}`);

///////////////////////////////////////////////////////////////////////////////////////

//MOEDA

let salario = 2500.3;
console.log(salario);
console.log(salario.toFixed(2));
console.log(salario.toFixed(0));
//mudando . para ,
console.log(salario.toFixed(2).replace(".", ","));

// formatacao para determinada moeda
console.log();
console.log(
  salario.toLocaleString("pt-br", { style: "currency", currency: "BRL" })
);
console.log(
  salario.toLocaleString("pt-br", { style: "currency", currency: "USD" })
);
console.log(
  salario.toLocaleString("pt-br", { style: "currency", currency: "EUR" })
);

let salarioDolar = salario * 0.18;
console.log(
  salarioDolar.toLocaleString("en", { style: "currency", currency: "USD" })
);

// formatacao de String

const nome = "Arthur Fudali";
console.log(nome.toUpperCase);
console.log(nome.length);
