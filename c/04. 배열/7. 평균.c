#include <stdio.h>

int main(){
    float len, a[1000], max = 0, sum = 0;
    scanf("%f", &len);
    for(int i = 0; i < len; i++){
        scanf("%f", &a[i]);
    }
    for(int i = 0; i < len; i++){
        if(a[i] > max){
            max = a[i];
        }
    }
    for(int i = 0; i < len; i++){
        sum += (a[i]/max)*100;
    }
    printf("%f", sum/len);
}