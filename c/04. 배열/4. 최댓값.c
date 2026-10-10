#include <stdio.h>

int main(){
    int a[9], max = 0, idx;
    for(int i = 0; i < 9; i++){
        scanf("%d", &a[i]);
    }
    for(int i = 0; i < 9; i++){
        if(a[i] > max){
            max = a[i];
            idx = i + 1;
        }
    }
    printf("%d\n%d", max, idx);
}