#include<iostream>
using namespace std;

//SW 문제해결 기본 2일차 SUM (D3)

int main(){
    int num[100][100] = {0};
    int max;

    for(int i=1;i<=10;i++){
        int row_sum[100]={0}, col_sum[100]={0}, diag_sum[2]={0}, tc_num; //행(가로), 열(세로) 대각 합 변수
        max = 0;
        scanf("%d", &tc_num);

        for(int j=0;j<100;j++){  //입력
            for(int k=0;k<100;k++)
                scanf("%d", &num[j][k]);
        }

        for(int j=0;j<100;j++){  //합 구하기
            for(int k=0;k<100;k++){
                row_sum[j] += num[j][k];
                col_sum[j] += num[k][j];
                if(j==k)
                    diag_sum[0]+=num[j][k];
                if(j+k==99)
                    diag_sum[1]+=num[j][k];
            }
        }

        for(int j=0;j<100;j++){  //행, 열 중 최댓값
            if(row_sum[j] >= max)
                max = row_sum[j];
            if(col_sum[j] >= max)
                max = col_sum[j];
        }
        for(int j=0;j<2;j++){  //대각선 중 최댓값
            if(diag_sum[j] >= max)
                max = diag_sum[j];
        }

        printf("#%d %d\n", tc_num, max);  //출력
    }

    return 0;
}