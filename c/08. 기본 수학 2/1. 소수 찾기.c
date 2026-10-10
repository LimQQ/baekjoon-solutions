#include <stdio.h>
#include <math.h>

int prime(int n){
    int sqrtn = sqrt(n);
    if (n == 1){
        return 0;
    }
    for(int i = 2; i <= sqrtn; i++){
        if(n%i == 0){
            return 0;
        }
    }
    return 1;
}

int main(){
    int n, t, cnt = 0;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &t);
        if(prime(t) == 1){
            cnt++;
        }
    }
    printf("%d", cnt);
}