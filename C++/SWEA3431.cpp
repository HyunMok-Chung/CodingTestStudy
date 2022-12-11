#include<iostream>
using namespace std;

// 준환이의 운동관리 (D3)

int main(){
    int t, l, u, x;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        scanf("%d %d %d", &l, &u, &x);
        if(x>u){
            printf("#%d -1\n", i);
        }else if(x<l){
            printf("#%d %d\n", i, l-x);
        }else{
            printf("#%d 0\n", i);
        }
    }

    return 0;
}