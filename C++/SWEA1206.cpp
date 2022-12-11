#include<iostream>
using namespace std;

//SW문제해결 기본 VIEW (D3)

int main(){
    int n, max, max_L, max_R, result;

    for(int i=1;i<=10;i++){
        n=0;
        result=0;
        scanf("%d", &n);
        int Building[n];

        for(int j=0;j<n;j++)
            scanf("%d", &Building[j]);

        for(int j=2;j<n-2;j++){
            max = 0;
            max_L=0;
            max_R=0;

            if(Building[j-2]>=Building[j-1])
                max_L = Building[j-2];
            else
                max_L = Building[j-1];
            
            if(Building[j+1]>=Building[j+2])
                max_R = Building[j+1];
            else
                max_R = Building[j+2];

            if(max_L>=max_R)
                max = max_L;
            else
                max = max_R;

            if(Building[j]>max)
                result += Building[j]-max;
        }
        
        printf("#%d %d\n", i, result);
    }

    return 0;
}