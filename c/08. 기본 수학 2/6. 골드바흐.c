#include <stdio.h>
#include <math.h>

int sieve[10000];

void eratosprime(int n){
    for(int i = 2; i <= n; i++){
        sieve[i] = 1;
    }
    int sqrtn = (int)sqrt(n);
    for (int i = 2; i <= sqrtn; i++){
        if (sieve[i] == 1){
            for (int j = i * i; j <= n; j += i){
                sieve[j] = 0;
            }
        }
    }
}

int main(){
    int t, a[102];
    scanf("%d", &t);
    while(t--){
        int idx = 0, n, x, y; 
        scanf("%d", &n);
        eratosprime(n);
        for(int i = 2; i <= n/2; i++){
            if(sieve[i] == 1 && sieve[n - i] == 1){
                a[idx] = i;
                a[idx + 1] = n-i;
                idx += 2;
            }
        }
        x = a[0]; y = a[1]; 
        for(int i = 2; i < idx-1; i += 2){
            if(a[i + 1] - a[i] < y - x){
                y = a[i + 1]; x = a[i];
            }
            a[i] = 0; a[i + 1] = 0;
        }
        printf("%d %d\n", x, y);
    }
}