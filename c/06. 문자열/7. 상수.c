#include <stdio.h>
#include <stdlib.h>

void swap(char *s);
int recon(char *a, char *b);

int main(){
    char a[4], b[4];
    scanf("%s %s", a, b);
    printf("%d", recon(a, b));
}

void swap(char *s){
    char t = *s;
    *s = *(s + 2);
    *(s + 2) = t;
}

int recon(char *a, char *b){
    swap(a);swap(b);
    int ai = atoi(a), bi = atoi(b);
    if(ai > bi){
        return ai;
    }
    return bi;
}