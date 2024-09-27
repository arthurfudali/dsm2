#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define T 5
struct Livro{
    char titulo[100];
    int anoEdicao;
    int nPaginas;
    float preco;
};

int main()
{
    setlocale(LC_ALL, "Portuguese");

    struct Livro l[T];
    int count =0;
    for(int i =0; i<T; i++){
        printf("Digite o título do livro: ");
        scanf("%s", l[i].titulo);
        fflush(stdin);
        printf("Digite o ano da edição: ");
        scanf("%d", &l[i].anoEdicao);


        printf("Digite o numero de paginas: ");
        scanf("%d", &l[i].nPaginas);
        count += l[i].nPaginas;

        printf("Digite o preco: ");
        scanf("%f", &l[i].preco);
    };
    int tam = (sizeof(l)/sizeof(struct Livro));
    float media = count/tam;

    for(int i =0; i<T; i++){
        printf("\nLivro %d: ", i+1);
        printf("\nTitulo: %s", l[i].titulo);
        printf("\nAno: %d", l[i].anoEdicao);
        printf("\nNumero de paginas: %d", l[i].nPaginas);
        printf("\nPreco: R$%.2f", l[i].preco);
    };

    printf("\nA média de paginas desses livros é: %.2f", media);


    return 0;
}
