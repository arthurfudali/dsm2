#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    int n;
    printf("Números ímpares entre 100 e 200:\n");

    for (n = 101; n< 200; n+= 2) {
        printf("%d\n", n);
    }

    return 0;
}
