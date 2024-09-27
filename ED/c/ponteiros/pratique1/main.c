#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vect[100], *p = NULL;
    p = &vect;

    for(int i = 0; i<100; i++){
        *p = 0;
        p++;
    }
    for(int i = 0; i<100; i++){
        printf("%d\n", vect[i]);
    }
    p = &vect;

    printf("\n-------------------- \n\n");

    for(int i = 1; i<=100; i++){
        *p = i;
        p++;
    }
    for(int i = 0; i<100; i++){
        printf("%d\n", vect[i]);
    }
    return 0;
}

// 2 a): p++ faz com que a posição do ponteiro na memória avance uma casa
// b) (*p)++ faz com que o valor de p seja acrescido em 1
// c) *(p++) faz com que o conteudo de p seja mostrado e que o ponteiro avance uma casa na memoria
// d) *(p+10) mostra o valor de p 10 casas a frente na memória

// 3) a comparação de ponteiros é
