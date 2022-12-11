#include<iostream>
using namespace std;

//이진수표현(D3)

int main(){
    int tc;
    int n,m, cnt;

    scanf("%d", &tc);
    for(int i=0;i<tc;i++){
        cnt=0;
        scanf("%d %d", &n, &m);
        for(int j=0;j<n;j++){
            if(m%2 == 1){
                cnt++;
                m/=2;
            }else{
                printf("#%d OFF\n", i+1);
                break;
            }
        }
        if(cnt == n)
            printf("#%d ON\n", i+1);
    }

    return 0;
}