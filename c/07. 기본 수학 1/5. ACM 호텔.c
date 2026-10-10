#include <stdio.h>

int main(){
    int H, W, N, f, r, t;
    scanf("%d", &t);
    while(t--){
        scanf("%d %d %d", &H, &W, &N);
        f = N%H; r = N/H + 1;
        if(N%H == 0){
            f = H;
            r--;
        }
        printf("%d%02d\n", f, r);
    }
}