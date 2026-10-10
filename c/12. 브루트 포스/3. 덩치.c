#include <stdio.h>

typedef struct _heiwei heiwei_t;

struct _heiwei{
    int height;
    int weight;
    int rank;
};

int main(){
    int n;
    heiwei_t list[50];
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d %d", &list[i].weight, &list[i].height);
        list[i].rank = 1;
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(list[i].weight < list[j].weight && list[i].height < list[j].height){
                list[i].rank++;
            }
        }
    }
    for(int i = 0; i < n; i++){
        printf("%d ", list[i].rank);
    }
}