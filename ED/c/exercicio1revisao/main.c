#include <stdio.h>
#include <stdlib.h>


int main()
{
 printf("Soma de todos os numeros impares multiplos de 5 de 1 ate 1000: ");
 int sum = 0;
 for (int i = 0; i<=1000; i++){
    if (i % 2 != 0){
        if (i % 5 == 0){
            sum = sum + i;
            printf("%i \n", i);
        }
    }
 }
 printf("Total: %i", sum);
 return 0;
}
