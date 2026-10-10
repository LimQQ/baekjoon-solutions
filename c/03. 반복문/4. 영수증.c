#include <stdio.h>

int main(){
    int total, sum = 0, n;
    scanf("%d %d", &total, &n);
    for(int i = 0; i < n; i++){
        int price, t;
        scanf("%d %d", &price, &t);
        sum += price * t;
    }
    if(sum == total){
        printf("Yes");
    }
    else{
        printf("No");
    }
}