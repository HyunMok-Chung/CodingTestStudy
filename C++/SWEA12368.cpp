#include<iostream>
using namespace std;

// 24시간 (D3)

int main(){
    int t;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        int a,b;
        scanf("%d %d", &a, &b);

        if(a+b>=24){
            printf("#%d %d\n", i, a+b-24);
        }else{
            printf("#%d %d\n", i, a+b);
        }
    }

    return 0;
}