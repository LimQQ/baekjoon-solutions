#include <stdio.h>

int main(){
    int cnt = 0, t;
    char word[1000001];
    while(scanf("%s", word) != EOF){
        cnt++;
    }
    printf("%d", cnt);
}