#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    int n, i;
    float fat=1;
    printf("Digite um valor para saber seu fatorial:");
    scanf("%d", &n);
    printf("%d! = %d", n, n);

    for(i=n; i>1; i--){
        printf(" X %d", i-1);
            fat = fat * i;
    }

    printf(" = %.0f", fat);
    return 0;
}
