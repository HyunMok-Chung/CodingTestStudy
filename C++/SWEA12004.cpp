#include<iostream>
using namespace std;

// 구구단1 (D3)

int main(){
    int tc, num, cnt;
    scanf("%d", &tc);

    for(int i=1;i<=tc;i++){
        scanf("%d", &num);
        cnt=0;
        for(int j=1;j<=9;j++){
            if(num%j==0 && num/j<10)
                cnt++;
        }
        if(cnt>0)
            printf("#%d Yes\n", i);
        else
            printf("#%d No\n", i);
    }
    return 0;
}