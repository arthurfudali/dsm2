/* 
3 – Crie uma função que receba um nome como parâmetro e exiba no console este nome formatado somente com letras maiúsculas, somente com letras minúsculas, e em seguida exiba o número de letras que esse nome possui.
 */

function mudarNome(x){
    const nomeUp = x.toUpperCase();
    const nomeLow = x.toLowerCase();
    const tam = x.length;
    return `${nomeUp} \n${nomeLow} \n${tam}`
}

console.log(mudarNome("Arthur Fudali"));