#include <stdio.h>

int main(){
    int n, r;
    char a[21];
    scanf("%d", &n);
    while(n--){
        int t = 0;
        scanf("%d %s", &r, a);
        while(a[t] != '\0'){
            for(int i = 0; i < r; i++){
                printf("%c", a[t]);
            }
            t++;
        }
        printf("\n");
    }
}