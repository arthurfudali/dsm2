#include <stdio.h>
#include <stdlib.h>

int main()
{
    int mat[4][3];

    for (l=0; l<4; l++){ //anda pelas linhas da matriz
        for(c=0; c<3; c++){ //anda pelas colunas da matriz
            mat[l][c] = 0;
        }
    }



    return 0;
}
