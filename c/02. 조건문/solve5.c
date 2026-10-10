#include <stdio.h>

int time(int h, int m, int t){
    while(m + t >= 60){
        h += 1;
        t -= 60;

        if (h == 24){
            h = 0;
        }
    }
    printf("%d %d", h, m + t);
    return 0;
}

int main(){
    int h, m, t;
    scanf("%d %d %d", &h, &m, &t);
    time(h, m, t);
}