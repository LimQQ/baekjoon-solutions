#include <stdio.h>

int time(int h, int m){
    if (m >= 45){
        printf("%d %d", h, m-45);
    }
    else if(m < 45 && h == 0){
        printf("%d %d", 23, m + 15);
    }
    else{
        printf("%d %d", h-1, m + 15);
    }
    return 0;
}

int main(){
    int h, m;
    scanf("%d %d", &h, &m);
    time(h, m);
}