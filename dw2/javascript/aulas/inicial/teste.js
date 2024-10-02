/* const pessoa = {
    nome: 'maria',
    cumprimentar: function(){
        console.log('olá meu nome é' + this.nome);
    },
    cumprimentarArrow: ()=> {
        console.log('olá meu nome é' + this.nome);
    },
}
pessoa.cumprimentar();
pessoa.cumprimentarArrow();

 *//* 
function exemploEscopo(){
    var x = 10;
    if (true){
        let y = 20;
        const z = 30;
        console.log(x+y+z);
    }
    console.log(x+y+z);
}
exemploEscopo(); */

function calcularDobro(numero){
    const resultado = numero*2;
    return resultado;
}
let valor = 7;
valor = calcularDobro(valor);
console.log(valor);

const multiplicar = (a,b) =>{
    return a*b;
}
var a = 10;
var b = 2;
console.log(multiplicar(a,b))