#include <stdio.h>
#include <stdlib.h>

void swap(int a[], int x, int y);

int main(){
    int n, a[1000000];
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &a[i]);
    }
    bubblesort(a, n);
    for(int i = 0; i < n; i++){
        printf("%d\n", a[i]);
    }
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