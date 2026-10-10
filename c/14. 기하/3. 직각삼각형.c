#include <stdio.h>

int main(){
    int a, b, c;
    while(1){
        scanf("%d %d %d", &a, &b, &c);
        if(a == 0 && b == 0 && c == 0){
            break;
        }
        if(a > c){
            a = a^c;
            c = a^c;
            a = a^c;
        }
        if(b > c){
            b = b^c;
            c = b^c;
            b = b^c;
        }
        if(a*a + b*b == c*c){
            printf("right\n");
        }
        else{
            printf("wrong\n");
        }
    }
}