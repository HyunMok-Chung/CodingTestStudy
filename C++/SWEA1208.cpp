#include<iostream>
using namespace std;

int main(){
    int n, max, max_Index, min, min_Index;
    int box[100]={0};

    for(int i=1;i<=10;i++){
        scanf("%d", &n);

        for(int j=0;j<100;j++)
            scanf("%d", &box[j]);
        
        for(int j=0;j<=n;j++){
            max=1; min=100;
            max_Index=0; min_Index=0;

            for(int k=0;k<100;k++){
                if(box[k]>=max){
                    max = box[k];
                    max_Index = k;
                }
            }
            for(int k=0;k<100;k++){
                if(box[k]<=min){
                    min = box[k];
                    min_Index = k;
                }
            }
            if(j==n)
                continue;
            box[max_Index]--;
            box[min_Index]++;
        }
        printf("#%d %d\n", i, max-min);
    }
}