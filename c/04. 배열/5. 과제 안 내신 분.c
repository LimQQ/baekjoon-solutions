#include <stdio.h>

int main(){
    int a[31] = {0}, k;
    for(int i = 0; i < 28; i++){
        scanf("%d", &k);
        a[k] = 1;
    }
    for(int i = 1; i <= 30; i++){
        if(a[i] == 0){
            printf("%d\n", i);
        }
    }
}