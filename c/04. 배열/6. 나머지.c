#include <stdio.h>

int main(){
    int a[10], mo[42] = {0},cnt = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d", &a[i]);
    }
    for(int i = 0; i < 10; i++){
        mo[a[i]%42]++;
    }
    for(int i = 0; i < 42; i++){
        if(mo[i] != 0){
            cnt++;
        }
    }
    printf("%d", cnt);
}