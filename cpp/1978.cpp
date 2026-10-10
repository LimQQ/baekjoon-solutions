#include <iostream>
#include <math.h>

int isPrime(int n);

int main(){
    int n, sum(0);
    std::cin >> n;
    for(int i = 0; i < n; i++){
        int t;
        std::cin >> t;
        sum += isPrime(t);
    }
    std::cout << sum;
}

int isPrime(int n){
    if(n == 1){
        return 0;
    }
    if(n > 2){
        for(int i = 2; i <= sqrt(n); i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }
    return 1;
}