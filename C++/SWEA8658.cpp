#include<iostream>
using namespace std;

// Summation (D3)

int main(){
    int t, max, min;
    int num[10];
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        int sum[10] = {0};
        max=0; min=1000001;

        for(int j=0;j<10;j++){
            scanf("%d", &num[j]);
            while(num[j] != 0 ){
                sum[j] += num[j]%10;
                num[j] /= 10;
            }
        }
        for(int j=0;j<10;j++){
            if(sum[j]>max)
                max = sum[j];
            if(sum[j]<min)
                min = sum[j];
        }
        printf("#%d %d %d\n", i, max, min);
    }

    return 0;
}