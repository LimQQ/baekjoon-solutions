#include <stdio.h>

int main(){
    int n, a, b;
    scanf("%d", &n);
    for(int i = 1; n > 0; i++){
        if(i%2){
            a = i;
            b = 1;
            while(a != 1 && n > 1){
                a--;
                b++;
                n--;
            }
        }
        else{
            a = 1;
            b = i;
            while(b != 1 && n > 1){
                a++;
                b--;
                n--;
            }
        }
        n--;
    }
    printf("%d/%d", a, b);
}