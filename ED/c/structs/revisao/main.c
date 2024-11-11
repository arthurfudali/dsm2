#include <stdio.h>
#include <stdlib.h>
struct Produto{
    char nome[100];
    int valor;
};
int main()
{
    stuct Produto p[2];
    for(int i = 0; i<2; i++){
        printf("Digite o nome do produto: ");
        scanf("%s", &p[i].nome);
        fflush(stdin);
        printf("Digite o nome do produto: ");
        scanf("%d", &p[i].valor);
    }

    printf("Hello world!\n");
    return 0;
}
