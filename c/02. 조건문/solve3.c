#include <stdio.h>

int comp0(int n){
    if (n > 0){
        return 1;
    }
    else{
        return 0;
    }
}

int main(){
    int a, b, x, y;
    scanf("%d %d", &a, &b);
    x = comp0(a);
    y = comp0(b);

    if (x == 1){
        if (y == 1){
            printf("1");
        }
        else{
            printf("4");
        }
    }

    else if (x == 0){
        if (y == 1){
            printf("2");
        }
        else{
            printf("3");
        }
    }
}