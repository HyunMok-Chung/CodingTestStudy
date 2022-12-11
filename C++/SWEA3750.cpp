#include<iostream>
using namespace std;

//Digit Sum (D3)

int main(){
    int t, sum;
    long long num;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        sum=0;
        scanf("%lld", &num);
        
        if(num<10){
            printf("#%d %lld\n", i, num);
            continue;
        }else{
            while(num>=10){
                while(num!=0){
                    sum += num%10;
                    num /= 10;
                }
                num=sum;
                sum=0;
            }
        }
        printf("#%d %lld\n", i, num);
    }

    return 0;
}