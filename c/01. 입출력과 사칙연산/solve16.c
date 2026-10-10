#include <stdio.h>

int main(){
    int ins[8], asc[8] = {1,2,3,4,5,6,7,8}, des[8] = {8,7,6,5,4,3,2,1}, t = 0;
    for(int i = 0; i < 8; i++){
        scanf("%d", &ins[i]);
    }
    for(int i = 0; i < 8; i++){
        if(ins[i] != asc[i]){
            break;
        }
        if(i == 7){
            t = 1;
        }
    }

    for(int i = 0; i < 8; i++){
        if(ins[i] != des[i]){
            break;
        }
        if(i == 7){
            t = 2;
        }
    }

    if(t == 1){
        printf("ascending");
    }
    else if(t == 2){
        printf("descending");
    }
    else{
        printf("mixed");
    }
}