#include<iostream>
#include<string>
using namespace std;

//평범한 숫자(D3)

int main(){
    int t;
    int n, cnt;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        cnt = 0;
        scanf("%d", &n);
        int num[n];
        
        for(int j=0;j<n;j++)
            scanf("%d", &num[j]);

        for(int j=1;j<=n-2;j++){
            if(num[j]<num[j-1] && num[j]<num[j+1])
                continue;
            else if(num[j]>num[j-1] && num[j]>num[j+1])
                continue;
            else
                cnt++;
        }

        printf("#%d %d\n", i, cnt);
    }

    return 0;
}