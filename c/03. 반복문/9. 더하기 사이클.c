#include <stdio.h>

int main(){
    int n, t, cnt = 1;
    scanf("%d", &n);
    t = 10 * (n%10) + (n/10 + n%10)%10;
    while(n != t){
        t = 10 * (t%10) + (t/10 + t%10)%10;
        cnt++;
    }
    printf("%d", cnt);
}