#include<iostream>
using namespace std;

// 간단한 369게임 (D2)

int main(){
    int n;
    scanf("%d", &n);
    for(int i=1;i<=n;i++){
        printf("%d", i);
        if(i==3){
            printf("-");
        }
    }
    printf("\n");
}