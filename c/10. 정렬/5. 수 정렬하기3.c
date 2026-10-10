#include <stdio.h>

int main(){
    int n, t, a[10001] = {0};
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &t);
        a[t]++;
    }
    for(int i = 0; i < 10001; i++){
        for(int j = 0; j < a[i]; j++){
            printf("%d\n", i);
        }
    }
}