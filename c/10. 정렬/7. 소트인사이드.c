#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void* first, const void* second);

int main(){
    char a[11];
    scanf("%s", a);
    qsort(a, strlen(a), sizeof(char), compare);
    printf("%s", a);
}

int compare(const void* first, const void* second){
    if(strcmp((char*)first, (char*)second) < 0){
        return 1;
    }
    return -1;
}