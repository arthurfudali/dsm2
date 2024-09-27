#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#define T 1
struct Habitante{
    int idade;
    char sex[1];
    float sal;
    int qtdF;
};
int main()
{
    setlocale(LC_ALL, "Portuguese");
    struct Habitante h[T];
    float count = 0;
    for(int i = 0; i<T; i++){
        printf("Digite a idade do habitante: ");
        scanf("%d", &h[i].idade);

        printf("Digite o sexo do habitante: ");
        scanf("%s", h[i].sex);

        printf("Digite o salario do habitante: ");
        scanf("%f", &h[i].sal);
        count += h[i].sal;

        printf("Digite a quantidade de filhos do habitante: ");
        scanf("%d", &h[i].qtdF);
    };
    int tam = sizeof(h)/sizeof(struct Habitante);
    float mediaS = count/tam;
    for(int i = 0; i<T; i++){
        printf("\nHabitante %d: ", i+1);
        printf("\nIdade: %d", h[i].idade);
        printf("\nSexo: %s", h[i].sex);
        printf("\nSalario: %.2f", h[i].sal);
        printf("\nQuantidade de filhos: %d", h[i].qtdF);
    }
    printf("\nMédia salarial: %.2f", mediaS);


    return 0;
}
