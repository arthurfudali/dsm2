/* 
2 – Crie uma função que receba um determinado salário em real como parâmetro e converta esse salário para as moedas Dólar e Euro. Deverá ser feito a conversão de valores e formatação da moeda. 
Considere:

1 real = 0.20 dólar

1 real = 0.19 euro
 */
function converterSalario(x) {
  const dolar = x * 0.2;
  const euro = x * 0.19;
return `Sálario: ${ x.toLocaleString("pt-br", { style: "currency", currency: "BRL" })} \nSalário em Dólar: ${ dolar.toLocaleString("pt-br", { style: "currency", currency: "USD" })} \nSalário em Euro: ${ euro.toLocaleString("pt-br", { style: "currency", currency: "EUR" })}`
}
console.log(converterSalario(1200))
