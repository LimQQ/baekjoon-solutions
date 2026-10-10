#include <stdio.h>

int main(){
    int len, v, a[100], cnt = 0;
    scanf("%d", &len);
    for(int i = 0; i < len; i++){
        scanf("%d", &a[i]);
    }
    scanf("%d", &v);
    for(int i = 0; i < len; i++){
        if(a[i] == v){
            cnt++;
        }
    }
    printf("%d", cnt);
}