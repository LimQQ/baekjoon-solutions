#include <stdio.h>

int main(){
    int time, sum = 0, cnt = 0, i = 0;
    char s[81];
    scanf("%d", &time);
    while(time--){
        scanf("%s", s);
        while(s[i] != '\0'){
            if(s[i] == 'O'){
                cnt++;
                sum += cnt;
            }
            else{
                cnt = 0;
            }
            i++;
        }
        printf("%d\n", sum);
        cnt = 0; sum = 0; i = 0;
    }
}