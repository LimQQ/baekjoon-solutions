#include <stdio.h>

int main(){
    int x[1000] = {0}, y[1000] = {0}, a, b;
    for(int i = 0; i < 3; i++){
        int xt, yt;
        scanf("%d %d", &xt ,&yt);
        x[xt]++; y[yt]++;
    }
    
    for(int i = 0; i < 1000; i++){
        if(x[i] == 1){
            a = i;
        }
        if(y[i] == 1){
            b = i;
        }
    }
    printf("%d %d", a, b);
}