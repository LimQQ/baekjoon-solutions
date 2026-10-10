#include <stdio.h>
#include <math.h>

void primerem(int n){
    int sqrtn = sqrt(n);
    for(int j = 2; j <= sqrtn; j++){
        while(n%j == 0){
            n /= j;
            printf("%d\n", j);
        }
    }
    if(n != 1){
        printf("%d\n", n);
    }
}

int main(){
    int n;
    scanf("%d", &n);
    primerem(n);
}