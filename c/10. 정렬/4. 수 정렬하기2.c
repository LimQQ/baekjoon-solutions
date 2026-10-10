#include <stdio.h>
#include <stdlib.h>

int compare(const void* first, const void* second);

int main(){
    short n, a[10000000];
    scanf("%hd", &n);
    for(int i = 0; i < n; i++){
        scanf("%hd", &a[i]);
    }
    qsort(&a, n, sizeof(short), compare);
    for(int i = 0; i < n; i++){
        printf("%hd\n", a[i]);
    }
}

int compare(const void* first, const void* second){
    if(*(short*)first > *(short*)second){
        return 1;
    }
    return -1;
}