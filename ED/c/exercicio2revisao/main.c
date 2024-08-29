#include <stdio.h>
#include <stdlib.h>

int main()
{
    int count = 0, menorH = 0, maiorH =0;
    printf("Digite a sua altura: ");
        scanf("%i", &menorH);
        maiorH = menorH;

    while( count < 7){
        int altura;
        printf("Digite a sua altura: ");
        scanf("%i", &altura);
        if (altura < menorH){
            menorH = altura;
        }
        if(altura > maiorH){
            maiorH = altura;
        }
        count ++;
    }
    printf("A maior altura e: %i\n", maiorH);
    printf("A menor altura e: %i \n", menorH);

    return 0;
}
