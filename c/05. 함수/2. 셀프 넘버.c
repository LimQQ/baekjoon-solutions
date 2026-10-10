#include <stdio.h>

int main(){
    int a[10001] = {0}, t, n;
    for(int i = 1; i <= 10000; i++){
        t = i;
        n = i;
        while(1){
            while(t > 0){
                n += t%10;
                t = t/10;
            }
            if(n > 10000 || a[n] != 0){
                break;
            }
            a[n]++; t = n;
        }
    }
    for(int i = 1; i <= 10000; i++){
        if(a[i] == 0){
            printf("%d\n", i);
        }
    }
}