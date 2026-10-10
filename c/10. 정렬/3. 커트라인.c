#include <stdio.h>

void swap(int a[], int x, int y);
void bubblesort(int a[], int n);

int main(){
    int n, k, a[1000];
    scanf("%d %d", &n, &k);
    for(int i = 0; i < n; i++){
        scanf("%d", &a[i]);
    }
    bubblesort(a, n);
    printf("%d", a[n - k]);
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