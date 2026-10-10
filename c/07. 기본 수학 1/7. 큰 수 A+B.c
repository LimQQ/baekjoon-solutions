#include <stdio.h>
#include <stdlib.h>

int main(){
    char a, b;
    scanf("%s %s", &a, &b);
    printf("%d", atoi(a) + atoi(b));
}