#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i=1, vect[1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000];
    while(i>0){
            vect[i] = vect[i]+i;
        printf("%d", vect[i]);
    }
    return 0;
}
