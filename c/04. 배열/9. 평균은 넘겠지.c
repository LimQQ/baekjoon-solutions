#include <stdio.h>

int main(){
    float time, len, a[1000], sum = 0, avg, cnt = 0;
    scanf("%f", &time);
    while(time--){
        scanf("%f", &len);
        for(int i = 0; i < len; i++){
            scanf("%f", &a[i]);
        }
        for(int i = 0; i < len; i++){
            sum += a[i];
        }
        avg = sum/len;
        for(int i = 0; i < len; i++){
            if(a[i] > avg){
                cnt++;
            }
        }
        printf("%.3f%%\n", (cnt/len)*100);
        cnt = 0; sum = 0;
    }
}