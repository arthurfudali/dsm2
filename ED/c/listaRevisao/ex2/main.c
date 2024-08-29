#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");
    float altura, maiorH, menorH;
    int i;
    printf("Digite a altura da pessoa 1: ");
    scanf("%f", &altura);
    maiorH = altura;
    menorH = altura;

    for(i=2; i<=8; i++){
        printf("Digite a altura da pessoa %d:", i);
        scanf("%f", &altura);


        if (altura > maiorH){
            maiorH = altura;
        }
        if(altura < menorH){
            menorH = altura;
        }
    }

    printf("A maior altura é: %.2f \n", maiorH);
    printf("A menor altura é: %.2f \n", menorH);
    return 0;
}
