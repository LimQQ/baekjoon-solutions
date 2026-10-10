#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void* first, const void* second);

int main(){
    char a[20000][51];
    int n;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", &a[i]);
    }
    qsort(a, n, sizeof(char) * 51, compare);
    for(int i = 0; i < n; i++){
        if(strcmp(a[i], a[i+1]) != 0){
            printf("%s\n", &a[i]);
        }
    }
}

int compare(const void* first, const void* second){
    if(strlen((char*)first) > strlen((char*)second) || ((strlen((char*)first) == strlen((char*)second)) && (strcmp((char*)first, (char*)second) > 0))){
        return 1;
    }
    return -1;
}