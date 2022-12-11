#include<iostream>

using namespace std;

int main(){
    int t, n;

    scanf("%d", &t);

    for(int i=0;i<t;i++){
        int sum = 0;
        scanf("%d", &n);
        for(int j=1;j<=n;j++){
            if(j%2 == 0){
                sum-=j;
            }else{
                sum+=j;
            }
        }
        printf("#%d %d\n", i+1, sum);
    }

    return 0;
}