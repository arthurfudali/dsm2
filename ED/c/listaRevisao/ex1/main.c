#include <stdio.h>
#include <stdlib.h>
# include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    int soma = 0;

    for (int i=1; i<=1000; i++){
        if (i%2!=0 && i%5==0){
            soma += i;
        }
    }
        printf("A soma de todos os números ímpares e múltiplos de 5 é: %d \n", soma);
        return 0;
}
