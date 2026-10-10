#include <stdio.h>

int main(){
    int t = 0, sum = 0;
    char word[15];
    scanf("%s", word);
    while(word[t] != '\0'){
        if(word[t] == 'Z' || word[t] == 'Y' || word[t] == 'V' || word[t] == 'S'){
            sum--;
        }
        sum += (word[t++] - 'A')/3 + 3;
    }
    printf("%d", sum);
}