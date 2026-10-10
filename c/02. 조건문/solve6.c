#include <stdio.h>

int reward(int a, int b, int c){
    if(a == b && b == c){
        return 10000 + a * 1000;
    }
    else if (a == b || b == c){
        return 1000 + b * 100;
    }
    else if (a == c){
        return 1000 + a * 100;
    }
    else{
        int max;
        max = a;
        if (max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        return max * 100;
    }
}

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    printf("%d", reward(a, b, c));
}