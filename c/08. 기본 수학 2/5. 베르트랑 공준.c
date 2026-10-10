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
    int n;
    while(1){
        scanf("%d", &n);
        if(n == 0){
            break;
        }
        int cnt = 0;
        for(int i = n + 1; i <= 2*n; i++){
            if(prime(i) == 1){
                cnt++;
            }
        }
        printf("%d\n", cnt);
    }
}