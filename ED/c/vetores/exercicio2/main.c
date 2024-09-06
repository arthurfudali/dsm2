#include <stdio.h>
#include <stdlib.h>

int main()
{
    // armazenar numeros em 2 vetores de 5 elementos e somar as posicoes equivalentes do vetor

    int n1[5], n2[5];
    for(int i=0; i<5; i++){
        printf("Digite um valor para a posicao %d do vetor 1: ", i+1);
        scanf("%d", &n1[i]);
    }
    for(int i=0; i<5; i++){
        printf("Digite um valor para a posicao %d do vetor 2: : ", i+1);
        scanf("%d", &n2[i]);
    }
    for (int i = 0; i<5; i++){
        int soma = n1[i] + n2[i];
        printf("A soma dos elementos na posicao %d e: %d \n", i+1, soma);
    }

    return 0;
}
