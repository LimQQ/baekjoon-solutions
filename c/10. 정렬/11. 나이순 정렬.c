#include <stdio.h>
#include <stdlib.h>

typedef struct _name name_t;

struct _name {
    int num;
    short age;
    char name[100];
};

int compare(const void* x, const void* y);
 
int main()
{
    int n;
    scanf("%d", &n);
    name_t list[100000];
    for (int i = 0; i < n; i++){
        list[i].num = i;
        scanf("%d %s", &list[i].age, list[i].name);
    }
    qsort(&list, n, sizeof(name_t), compare);
    for (int i = 0; i < n; i++){
        printf("%d %s\n", list[i].age, list[i].name);
    }
}

int compare(const void* x, const void* y){
    if((((name_t *)x)->age > ((name_t *)y)->age) || ((((name_t *)x)->age == ((name_t *)y)->age) && (((name_t *)x)->num > ((name_t *)y)->num))){
        return 1;
    }
    return 0;
}