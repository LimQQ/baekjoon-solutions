#include <stdio.h>

int main(){
    int t = 0, alpha[26] = {0}, max = 0, cnt = 0, idx;
    char word[1000001];
    scanf("%s", word);
    while(word[t] != '\0'){
        if(word[t] >= 'a'){
            alpha[word[t] - 32 - 'A']++;
        }
        else{
            alpha[word[t] - 'A']++;
        }
        t++;
    }

    for(int i = 0; i < 26; i++){
        if(alpha[i] > max){
            max = alpha[i];
        }
    }

    for(int i = 0; i < 26; i++){
        if(alpha[i] == max){
            cnt++;
            idx = i;
        }
    }

    if(cnt > 1){
        printf("?");
    }
    else{
        printf("%c", idx + 'A');
    }
}