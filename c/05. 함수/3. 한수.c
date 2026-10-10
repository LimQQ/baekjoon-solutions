#include <stdio.h>

int ifhansu(int n){
    int a[4] = {0}, i = 0, d;
    while(n > 0){
        a[i++] = n%10;
        n /= 10;
    }
    d = a[1] - a[0];
    for(int j = 1; j < i - 1; j++){
        if(a[j + 1] - a[j] != d){
            return 0;
        }
    }
    return 1;
}

int main(){
    int n, cnt = 0;
    scanf("%d", &n);
    for(int i = 1; i <= n; i++){
        if(ifhansu(i)){
            cnt++;
        }
    }
    printf("%d", cnt);
}