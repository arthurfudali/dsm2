#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    float media, pPos, pNeg;
    int i = 1, valor, soma = 0, total, pos = 0, neg = 0;

    printf("Digite os valores (digite 0 para terminar):\n");

    while (i > 0) {
        printf("Valor: ");
        scanf("%d", &valor);

        if (valor == 0) {
            break;
        }

        soma += valor;

        if (valor > 0) {
            pos++;
        } else if (valor < 0) {
            neg++;
        }
        i++;
    }


        total = i-1;
        media = soma / total;
        pPos = ((float)pos / (float)total) * 100;
        pNeg = ((float)neg / (float)total) * 100;

        printf("Média: %.2f\n", media);
        printf("Quantidade de valores positivos: %d\n", pos);
        printf("Quantidade de valores negativos: %d\n", neg);
        printf("Percentual de positivos: %.2f%%\n", pPos);
        printf("Percentual de negativos: %.2f%%\n", pNeg);

        return 0;
}
