#include <stdio.h>

int main(){
    int n, t, a[10000001] = {0};
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &t);
        if(t > 0){
            if(a[t] == -1){
                a[t] = 2;
            }
            else{
                a[t] = 1;
            }
        }
        else if(t < 0){
            t *= -1;
            if(a[t] == 1){
                a[t] = 2;
            }
            else{
                a[t] = -1;
            }
        }
        else{
            a[0] = 1;
        }
    }

    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &t);
        if(t > 0){
            if(a[t] == 1 || a[t] == 2){
                printf("1 ");
            }
            else{
                printf("0 ");
            }
        }
        else if(t < 0){
            t *= -1;
            if(a[t] == -1 || a[t] == 2){
                printf("1 ");
            }
            else{
                printf("0 ");
            }
        }
        else if(t == 0){
            if(a[0] == 1){
                printf("1 ");
            }
            else{
                printf("0 ");
            }
        }
    }
}