#include <stdio.h>
#include <stdlib.h>

int main()
{
    // armazenar 4 notas em um vetor e depois calcular a média dessas notas
    double notas[4];
    double total = 0;
    int count =0;
    for (int i =0; i<4; i++){
        printf("Digite uma nota: ");
        scanf("%lf", &notas[i]);
        total+= notas[i];
        count ++;
    }
    double media = total/count;
    printf("A média dessas notas é: %lf", media);



    return 0;
}
