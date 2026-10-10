#include <stdio.h>

int main(){
    int n, t = 666, cnt = 0;
    scanf("%d", &n);
    while(1){
        int k = t, a[100], idx = 0;
        while(k){
            a[idx++] = k%10;
            k /= 10;
        }
        for(int i = 1; i < idx - 1; i++){
            if(a[i - 1] == 6 && a[i] == 6 && a[i + 1] == 6){
                cnt++;
                break;
            }
        }
        if(cnt == n){
            printf("%d", t);
            break;
        }
        t++;
    }
}