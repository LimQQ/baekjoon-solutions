#include <stdio.h>

int main(){
    int first[5], next[5] = {0}, a, b, t;
    scanf("%d", &t);
    while(t--){
        scanf("%d %d", &a, &b);
        for(int i = 0; i < b; i++){
            first[i] = i + 1;
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                for(int k = 0; k <= j; k++){
                    next[j] += first[k];
                }
            }
            for(int j = 0; j < b; j++){
                first[j] = next[j];
                next[j] = 0;
            }
            printf("%2d", i + 1);
            for(int j = 0; j < b; j++){
                printf("%5d", first[j]);
            }
            printf("\n");
        }
        printf("%d\n", first[b - 1]);
    }
}