#include <stdio.h>
#include <stdlib.h>

//criação de constante:
#define SZ 10
// a constante não muda, então pode ser usada por todo o programa

int main()
{
    printf("Hello world!\n");

    //declarar o vetor
    int numeros[SZ]; //trocar o valor de 10 pela constante
    int i, maior=0;
    for(i=0; i<SZ; i++)
    {
        printf("Digite um valor: ");
        scanf("%i", &numeros[i]);
    }
    //encontrar o maior valor
    for(i=0; i<SZ; i++){
        if(numeros[i] > maior){
            maior = numeros[i];
        }
    }




    printf("O maior numero é: %d", maior);
    return 0;
}
