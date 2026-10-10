#include <stdio.h>

int main(){
    int t = 0;
    char a[100];
    scanf("%s", a);
    for(int i = 0; i < 26; i++){
        while(a[t] != '\0'){
            if(a[t] == 'a' + i){
                printf("%d ", t);
                break;
            }
            else if(a[t+1] == '\0'){
                printf("%d ", -1);
            }
            t++;
        }
        t = 0;
    }
}