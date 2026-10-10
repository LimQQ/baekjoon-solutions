#include <stdio.h>
#include <stdlib.h>

typedef struct _coord coord_t;

struct _coord{
    int idx;
    int num;
    int cnt;
};

int compare1(const void* first, const void* second);
int compare2(const void* first, const void* second);

int main(){
    int n, k = 0;
    coord_t a[1000000];
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &a[i].num);
        a[i].idx = i;
    }
    qsort(&a, n, sizeof(coord_t), compare1);
    for(int i = 0; i < n; i++){
        a[i].cnt = k;
        if(a[i].num != a[i + 1].num){
            k++;
        }
    }
    qsort(&a, n, sizeof(coord_t), compare2);
    for(int i = 0; i < n; i++){
        printf("%d ", a[i].cnt);
    }
}

int compare1(const void* first, const void* second){
    if(((coord_t *)first)->num > ((coord_t*)second)->num){
        return 1;
    }
    return -1;
}

int compare2(const void* first, const void* second){
    if(((coord_t *)first)->idx > ((coord_t*)second)->idx){
        return 1;
    }
    return -1;
}