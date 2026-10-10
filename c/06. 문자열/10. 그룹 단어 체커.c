#include <stdio.h>

int check(char *s);

int main(){
    int n, cnt = 0;
    char word[100];
    scanf("%d", &n);
    while(n--){
        scanf("%s", word);
        if(check(word)){
            cnt++;
        }
    }
    printf("%d", cnt);
}

int check(char *word){
    int idx = 0, alpha[26] = {0};
    while(word[idx] != '\0'){
        char t = word[idx];
        if(alpha[t - 'a'] == 1){
            return 0;
        }
        else{
            alpha[t - 'a'] = 1;
            while(word[++idx] == t){
            }
        }
    }
    return 1;
}