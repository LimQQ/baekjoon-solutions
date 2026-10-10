#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct dogam dogam_t;

struct dogam{
    int num;
    char name[21];
};

int main(){
    dogam_t a[1000];
    int n, m;
    scanf("%d %d\n", &n, &m);
    for(int i = 1; i <= n; i++){
        scanf("%s", &a[i].name);
        a[i].num = i;
    }

    while(m--){
        char t[21];
        scanf("%s", &t);
        for(int i = 1; i <= n; i++){
            if(strcmp(a[i].name, t) == 0){
                printf("%d\n", i);
                break;
            }
            if(i == n - 1){
                int k = atoi(t);
                printf("%s\n", a[k].name);
            }
        }
    }
}