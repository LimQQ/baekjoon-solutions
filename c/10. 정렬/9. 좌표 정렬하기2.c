#include <stdio.h>
#include <stdlib.h>

typedef struct _coord coord_t;

struct _coord {
    int x;
    int y;
};

int compare(const void* x, const void* y);
 
int main()
{
    int n;
    scanf("%d", &n);
    coord_t point[100000];
    for (int i = 0; i < n; i++)
        scanf("%d %d", &point[i].x, &point[i].y);
    qsort(&point, n, sizeof(coord_t), compare);
    for (int i = 0; i < n; i++)
        printf("%d %d\n", point[i].x, point[i].y);
}

int compare(const void* x, const void* y){
    if(((coord_t *)x)->y > ((coord_t *)y)->y ||(((coord_t *)x)->y == ((coord_t *)y)->y && ((coord_t *)x)->x > ((coord_t *)y)->x)){
        return 1;
    }
    return 0;
}