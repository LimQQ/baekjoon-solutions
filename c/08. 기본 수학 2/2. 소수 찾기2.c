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
    int n, m, sum = 0;
    scanf("%d %d", &n, &m);
    int min = m;
    for(int i = n; i <= m; i++){
        if(prime(i) == 1){
            sum += i;
            if(i < min){
                min = i;
            }
        }
    }
    if(sum == 0){
        printf("%d", -1);
    }
    else{
        printf("%d\n%d", sum, min);
    }
}