#include <stdio.h>

int main(){
    int m, n, x = 0, y = 0, min = 32, cnt = 0, WBcontrol = 1;
    char board[51][51], WB[9] = "WBWBWBWB", BW[9] ="BWBWBWBW";
    scanf("%d %d", &m, &n);
    for(int i = 0; i < m; i++){
        scanf("%s", board[i]);
    }
    while(y <= m - 8){
        x = 0;
        while(x <= n - 8){
            cnt = 0;
            WBcontrol = 0;
            for(int i = y; i < y + 8; i++){
                for(int j = x; j < x + 8; j++){
                    if(WBcontrol % 2 == 0){
                        if(board[i][j] != WB[j-x]){
                            cnt++;
                        }
                    }
                    else{
                        if(board[i][j] != BW[j-x]){
                            cnt++;
                        }
                    }
                }
                WBcontrol++;
            }
            if(cnt < min){
                min = cnt;
            }

            cnt = 0;
            WBcontrol = 1;
            for(int i = y; i < y + 8; i++){
                for(int j = x; j < x + 8; j++){
                    if(WBcontrol % 2 == 0){
                        if(board[i][j] != WB[j-x]){
                            cnt++;
                        }
                    }
                    else{
                        if(board[i][j] != BW[j-x]){
                            cnt++;
                        }
                    }
                }
                WBcontrol++;
            }
            if(cnt < min){
                min = cnt;
            }
            x++;
        }
        y++;
    }
    printf("%d", min);
}