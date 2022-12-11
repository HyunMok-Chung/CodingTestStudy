#include<iostream>
using namespace std;

// 평균값 구하기 (D1)

int main(){
    int t;
    int num[10], sum;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        sum=0;
        for(int j=0;j<10;j++){
            scanf("%d", &num[j]);
            sum+=num[j];
        }
        printf("#%d %.0f\n", i, sum/10.0);  // 자릿수를 맞추기 위해 자동으로 값을 반올림하여 출력
    }

    return 0;
}