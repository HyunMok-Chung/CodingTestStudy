#include<iostream>
using namespace std;

// 조별과제 (D3)

int main(){
    int t, stu;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        scanf("%d", &stu);
        printf("#%d %d\n", i, stu/3);
    }

    return 0;
}