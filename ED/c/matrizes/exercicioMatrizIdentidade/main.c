#include <stdio.h>
#include <stdlib.h>
#define CT 10
int main()
{
    int mat[CT][CT];

     for (int l=0; l<CT; l++){ //anda pelas linhas da matriz
        for (int c=0; c<CT; c++){ //anda pelas colunas da matriz
            if(l==c){
                mat[l][c] = 1;
            }
            else{
                mat[l][c] = 0;
            }
        }
    }
    for (int l=0; l<CT; l++){
        for (int c=0; c<CT; c++){
            printf("%d ", mat[l][c]);
        }
        printf("\n");
    }

    return 0;
}
