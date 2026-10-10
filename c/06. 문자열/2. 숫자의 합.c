#include <stdio.h>

int main(){
    int n, sum = 0;
    char a;
    scanf("%d\n", &n);
    for(int i = 0; i < n; i++){
        scanf("%c", &a);
        sum += a - '0';
    }
    printf("%d", sum);
}