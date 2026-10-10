#include <stdio.h>

int main(){
    int n, m, a[100][100], k;
    scanf("%d %d", &n, &m);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            scanf("%d", &a[i][j]);
        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            scanf("%d", &k);
            printf("%d ", a[i][j] + k);
            if(i != n-1 && j == m-1){
                printf("\n");
            }
        }
    }
}