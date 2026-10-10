#include <stdio.h>

int main(){
    int len, a[1000000], max, min;
    scanf("%d", &len);
    for(int i = 0; i < len; i++){
        scanf("%d", &a[i]);
    }
    max = a[0]; min = a[0];
    for(int i = 1; i < len; i++){
        if(a[i] < min){
            min = a[i];
        }
        if(a[i] > max){
            max = a[i];
        }
    }
    printf("%d %d", min, max);
}