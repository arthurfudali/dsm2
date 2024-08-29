#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int i=0, numero, numerosPares=0, numerosImpares=0, somaPares=0, somaTotal=0, numerosTotais=0;
    float mediaPares, mediaTotal;

    printf("Digite números positivos (0 para encerrar):\n");

    while (i>=0) {
        scanf("%d", &numero);

        if (numero == 0) {
            break;
        }

        if(numero%2==0){
            numerosPares++;
             somaPares += numero;
        } else {
            numerosImpares++;
        }

        numerosTotais++;
        somaTotal += numero;
        i++;
    }

        mediaPares = somaPares / numerosPares;
        mediaTotal = somaTotal / numerosTotais;

        printf("A quantidade de números pares é: %d \n", numerosPares);
        printf("A quantidade de números ímpares é: %d \n", numerosImpares);

        printf("A média dos números pares é: %f \n", mediaPares);
        printf("A média de todos os números é: %f \n", mediaTotal);


    return 0;
}
