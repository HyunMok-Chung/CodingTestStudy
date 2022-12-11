#include<iostream>
using namespace std;

int main(){
    int t;
    // int sum[t];
    scanf("%d", &t);

    for(int i=0;i<t;i++){
        int sum=0;
        for(int j=0;j<10;j++){
            int num[10];
            scanf("%d", &num[j]);
            if(num[j]%2 == 1){
                sum += num[j];
            }
        }
        printf("#%d %d\n", i+1, sum);
    }

    return 0;
}