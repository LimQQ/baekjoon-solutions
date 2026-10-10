#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        int t = i, sum;
        sum = t;
        while(t){
            sum += t%10;
            t/= 10;
        }
        if(sum == n){
            printf("%d", i);
            break;
        }
        else if(i == n - 1){
            printf("%d", 0);
        }
    }
}