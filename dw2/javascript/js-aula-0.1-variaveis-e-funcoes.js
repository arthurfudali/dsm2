// declaração de variaveis
// const x let x var

const nome = "Arthur"; // var criadas com const precisam ser atribuidas logo de cara
var cidade;
let idade;
let endereco;

idade = 18;
cidade = "Registro";
console.log(nome);
console.log(idade);
console.log(cidade);

console.log("-----------------------------------");

// TYPEOF

const sobrenome = "Fudali";
console.log("Tipo da variavel: ");
console.log(typeof sobrenome);
console.log(typeof endereco);

console.log("-----------------------------------");

// TIPOS DE FUNCOES

// funcao simples:
function minhaFuncao() {
  console.log("ola mundo@ ");
}
minhaFuncao();

//funcao com parametro / argumento

function soma(n1, n2) {
  //nesse caso recebe como parametro 2 numeros: n1 e n2
  console.log(n1 + n2);
  resultado = n1 + n2;
  console.log(`A soma dos dois numeros foi ${resultado}`); // concatenando com literal/template Strings com placeholders => ${}
}
function saudacao(nome) {
  //para deixar um parametro opcional é so deixar ele pré informado
  console.log("bem vindo " + nome);
}
numero1 = 10;
numero2 = 20;
soma(numero1, numero2); //os "parametros" que são enviados para a função são chamados de argumentos
soma(20, 70);
saudacao("Arthur");

//função com retorno:

function Soma(n1, n2) {
  return n1 + n2;
}
console.log("");
console.log("Funcoes com retorno:  ");
console.log(`A soma dos dois numeros foi ${Soma(2, 6)}.`);

function parImpar(n) {
  if (n % 2 == 0) {
    return "par";
  } else {
    return "impar";
  }
}
let n = 12;
console.log(`O numero ${n} é ${parImpar(n)}`);

