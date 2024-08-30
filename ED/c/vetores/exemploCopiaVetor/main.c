#include <stdio.h>
#include <stdlib.h>
#define SZ 5
int main()
{
    int numero[SZ], copia[SZ];
    int i;
    for (i=0; i<SZ; i++){
        printf("Digite um valor: ");
        scanf("%d", &numero[i]);
    }
    //copiar
    for (i=0; i<SZ; i++){
        copia[i] = numero[i];
    }
    for (i=0; i<SZ; i++){
        printf("\n %d ", copia[i]);
    }
    return 0;
}
