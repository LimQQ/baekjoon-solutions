#include <stdio.h>
#include <stdlib.h>

int compare(const void* first, const void* second);

int main(){
    short n, a[500000], count[8002] = {0}, cntmax = 0, cntmaxn, cntcntmax = 0, sum = 0, max = -4000, min = 4000, idx = 0;
    scanf("%hd", &n);
    for(int i = 1; i <= n; i++){
        scanf("%hd", &a[i]);
        sum += a[i];
        count[a[i] + 4000]++;
        if(a[i] >= max){
            max = a[i];
        }
        if(a[i] <= min){
            min = a[i];
        }
    }
    for(int i = 0; i < 8001; i++){
        if(count[i] > cntmax){
            cntmax = count[i];
            cntmaxn = i - 4000;
        }
    }
    for(int i = 0; i < 8001; i++){
        if(count[i] == cntmax){
            cntcntmax++;
        }
    }
    if(cntcntmax > 1){
        for(int i = 0; i < 8001; i++){
            if(count[i] == cntmax){
                idx++;
            }
            if(idx == 2){
                cntmaxn = i - 4000;
            }
        }
    }
    qsort(&a, n, sizeof(short), compare);
    printf("%hd\n%hd\n%hd\n%hd", sum/n, a[(n + 1)/2], cntmaxn, max - min);
}

int compare(const void* first, const void* second){
    if(*(int*)first > *(int*)second){
        return 1;
    }
    return -1;
}