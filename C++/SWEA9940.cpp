#include<iostream>
using namespace std;

int main(){
    int tc, temp, N, cnt;
    int num[100001];
    scanf("%d", &tc);

    for(int i=1;i<=tc;i++){
        cnt = 0;
        scanf("%d", &N);

        for(int j=0;j<N;j++)
            scanf("%d", &num[j]);
        
        sort(num, num+N);

        for(int j=0;j<N-1;j++){
            if(num[j+1]-num[j]>1 || num[j]==num[j+1])
                cnt++;
        }
        if(cnt>0)
            printf("#%d No\n", i);
        else
            printf("#%d Yes\n", i);
    }

    return 0;
}