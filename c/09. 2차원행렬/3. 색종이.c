#include <stdio.h>

int main(){
    int a[100][100] = {0}, n, x, y, width = 0;
    scanf("%d", &n);
    while(n--){
        scanf("%d %d", &x, &y);
        for(int i = x; i < x + 10; i++){
            for(int j = 100 - y; j > 90 - y; j--){
                a[i][j] = 1;
            }
        }
    }
    for(int i = 0; i < 100; i++){
        for(int j = 0; j < 100; j++){
            if(a[i][j] == 1){
                width++;
            }
        }
    }
    printf("%d", width);
}