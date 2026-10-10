#include <stdio.h>

int main(){
    unsigned int fix, cha, price;
    scanf("%u %u %u", &fix, &cha, &price);
    if(cha >= price){
        printf("%d", -1);
    }
    else{
        printf("%u", fix/(price-cha) + 1);
    }
}