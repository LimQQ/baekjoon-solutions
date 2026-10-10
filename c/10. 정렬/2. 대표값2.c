#include <stdio.h>

void swap(int a[], int x, int y);
void bubblesort(int a[], int n);

int main(){
    int n, a[5], sum = 0;
    for(int i = 0; i < 5; i++){
        scanf("%d", &a[i]);
        sum += a[i];
    }
    bubblesort(a, 5);
    printf("%d\n%d", sum/5, a[2]);
}

void swap(int a[], int x, int y){
    int t = a[x];
    a[x] = a[y];
    a[y] = t;
}

void bubblesort(int a[], int n){
    for(int i = n; i > 0; i--){
        for(int j = 0; j < i - 1; j++){
            if(a[j] > a[j + 1]){
                swap(a, j, j+1);
            }
        }
    }
}