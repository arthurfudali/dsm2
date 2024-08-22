// ARRAYS
// F8 para executar

let produtos = ["Computador", "Notebook", "Celular", "Tablet"];

// Exibição em forma de array
console.log(typeof produtos);
console.log(produtos);

console.log("------------------");

// Exibição individual
console.log(produtos[2]);

console.log("------------------");

// Exibição em lista com o forEach
produtos.forEach((produto, i) => {
  console.log(i, produto);
});

console.log("------------------");

// Exibição com o FOR
for (let x in produtos) {
  /* console.log(`${x + 1} = ${produtos[x]}`); */ // -> assim não funciona pq o JS interpreta como uma concatenação
  console.log(`${Number(x) + 1} = ${produtos[x]}`); // necessario o uso do 'Casting'
}

console.log("------------------");

// Manipulacao de vetores
let listaFrutas = ["laranja", "maca", "banana", "pera"];
console.log(`O vetor é:  ${listaFrutas}`);

console.log("------------------");

//push -> insere um novo elemento no final da lista
listaFrutas.push("abacaxi");
console.log(`O vetor é:  ${listaFrutas}`);

//unshif -> insere no comeco do vetor
listaFrutas.unshift("uva");
console.log(`O vetor é:  ${listaFrutas}`);

console.log("------------------");

//length -> retorna o numero de elementos

console.log(`O numero de elementos do vetor é: ${listaFrutas.length}`);

//sort -> ordena um vetor
let numeros = [1, 5, 3, 6, 2, 4];
console.log(`O vetor é:  ${numeros}`);
console.log(`O vetor ordernado é:  ${numeros.sort()}`);

console.log("------------------");

// OBJETOS LITERAIS (com Atributos e Metodos)

let carro = {
  // atributos
  modelo: "gol",
  cor: "vermelho",

  //metodos
  acelerar() {
    return "acelerando";
  },
  frear() {
    return "freiando";
  },
};
console.log(carro.acelerar());

const product = {
  name: "computer",
  brand: "lenovo",
  price: 3000,
  desc: "good computer",
};
console.log(
  `The product ${product.name} from ${product.brand} costs ${product.price}`
);

// Array de objetos
const productList = [
  {
    name: "PC",
    brand: "Intel",
    price: 5000,
    desc: "Modern computer with good performance.",
  },
  {
    name: "Tablet",
    brand: "Samsung",
    price: 3000,
    desc: "Good tablet.",
  },
  {
    name: "Phone",
    brand: "Apple",
    price: 8000,
    desc: "High end device.",
  },
];

console.log("------------------");

//exibindo com forEach:
productList.forEach((product) => {
  console.log(product.name);
  console.log(product.desc);
  console.log(product.brand);
  console.log(product.price);
  console.log("");
});
