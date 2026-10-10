#include <stdio.h>
#include <stdlib.h>

int main(){
    int n, jack, a[100], max = 0;
    scanf("%d %d", &n, &jack);
    for(int i = 0; i < n; i++){
        scanf("%d", &a[i]);
    }
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            for(int k = j + 1; k < n; k++){
                int t = a[i] + a[j] + a[k];
                if(t > max && t <= jack){
                    max = t;
                }
            }
        }
    }
    printf("%d", max);
}