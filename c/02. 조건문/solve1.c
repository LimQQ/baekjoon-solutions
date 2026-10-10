#include <stdio.h>

int comp(int a, int b){
    if (a > b){
        printf(">");
    }
    else if (a == b){
        printf("==");
    }
    else{
        printf("<");
    }
    return 0;
}

int main(){
    int a, b;
    scanf("%d %d", &a, &b);
    comp(a,b);
}