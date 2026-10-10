#include <stdio.h>
#include <string.h>

int main(){
    char a[10000][501], cnt = 0;
    int n, m;
    scanf("%d %d\n", &n, &m);
    for(int i = 0; i < n; i++){
        scanf("%s", &a[i]);
    }

    while(m--){
        char t[501];
        scanf("%s", &t);
        for(int i = 0; i < n; i++){
            if(strcmp(a[i], t) == 0){
                cnt++;
            }
        }
    }
    printf("%d", cnt);
}