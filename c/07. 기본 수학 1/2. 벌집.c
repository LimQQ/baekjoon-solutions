#include <stdio.h>

int main(){
    int n, cnt = 0;
    scanf("%d", &n);;
    for(int i = 1; n > 0; i++){
        n -= 6 * i;
        cnt++;
    }
    printf("%d", cnt);
}