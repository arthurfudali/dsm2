/* 1 – Crie uma função que a partir da data atual, exiba no console uma nova data da seguinte forma:

- Três dias a mais do que o dia atual.

- Quatro meses a mais do que o mês atual.

- Seis anos a mais do que o ano atual.

O formato da data deve ser exibida no padrão dia/mês/ano. */

const dataAtual = new Date();

function novaData(x) {
  const dia = x.getDate();
  const mes = x.getMonth() + 1;
  const ano = x.getFullYear();
  return "nova data: " + (dia + 3) + "/" + (mes + 4) + "/" + (ano + 6);
}
console.log(novaData(dataAtual));
