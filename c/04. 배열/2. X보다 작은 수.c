#include <stdio.h>

int main(){
    int len, x, a[10000];
    scanf("%d %d", &len, &x);
    for(int i = 0; i < len; i++){
        scanf("%d", &a[i]);
    }
    for(int i = 0; i < len; i++){
        if(a[i] < x){
            printf("%d ", a[i]);
        }
    }
    
}