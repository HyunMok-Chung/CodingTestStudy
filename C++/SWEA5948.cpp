#include<iostream>
#include<algorithm>
using namespace std;

// 새샘이의 7-3-5 게임 (D3)

int main(){
    int t, sum, index, min, cnt;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        int num[7];
        int sum[210] = {0};
        index = 0; cnt = 0;
        for(int j=0;j<7;j++)
            scanf("%d", &num[j]);
        sort(num, num+7);
        for(int j=6;j>=2;j--){
            for(int k=j-1;k>=1;k--){
                for(int l=k-1;l>=0;l--){
                    sum[index] = num[j] + num[k] + num[l];
                    index++;
                }
            }
        }
        sort(sum, sum+210);
        min = sum[209];
        for(int j=209;j>=0;j--){
            if(sum[j] == sum[j-1])
                continue;
            if(sum[j]<min){
                min = sum[j];
                cnt++;
                if(cnt==4)
                    break;
            }
        }
        printf("#%d %d\n", i, min);
    }

    return 0;
}