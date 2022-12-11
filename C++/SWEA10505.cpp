#include<iostream>
using namespace std;

// 소득 불균형 (D3)

int main(){
    int t, n, sum, cnt;
    int num[100001];
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        scanf("%d", &n);
        sum=0; cnt=0;

        for(int j=0;j<n;j++){
            scanf("%d", &num[j]);
            sum += num[j];
        }

        for(int j=0;j<n;j++){
            if(num[j]<=(int)sum/n)
                cnt++;
        }
        printf("#%d %d\n", i, cnt);
    }

    return 0;
}