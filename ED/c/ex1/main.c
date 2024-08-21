#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Digite um numero: ");
    scanf("%i", &n);
    if(n%2 == 0){
        printf("O numero e par \n");
    }else{
        printf("O numero e impar \n");
    }
    if (n<0){
        printf("O numero e negativo");
    }else if(n>0){
        printf("O numero e positivo");
    }else{
        printf("O numero e 0");
    }


}
