#include<iostream>
using namespace std;

//계산기 (D3)

int main(){
    int t, n, max;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        max = 0;
        scanf("%d", &n);
        int num[n];

        for(int j=0;j<n;j++)
            scanf("%d", &num[j]);
        
        if(n==1){
            printf("#%d %d\n", i, num[0]);
            continue;
        }else if(num[0]+num[1] >= num[0]*num[1])
            max = num[0]+num[1];
        else
            max = num[0]*num[1];

        for(int j=2;j<n;j++){
            if(max+num[j] >= max*num[j])
                max = max+num[j];
            else
                max = max*num[j];
        }

        printf("#%d %d\n", i, max);
    }

    return 0;
}