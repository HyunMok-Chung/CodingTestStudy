#include<iostream>
using namespace std;

//체스판 위의 룩 배치(D3)

int main(){
    int t;
    scanf("%d", &t);

    for(int tc=1;tc<=t;tc++){
        char rook[8][9];
        int cnt=0, line_cnt;
        int m[8]={0};
        string result = "yes";
        
        for (int i = 0; i < 8; i++){
            cin>>rook[i];
        }

        for (int i = 0; i < 8; i++){
            line_cnt=0;
            for (int j = 0; j < 8; j++){
                if(rook[i][j] == 'O' && line_cnt==0 && m[j]==0){
                    m[j]++;
                    line_cnt++;
                    cnt++;
                }else if(rook[i][j] == 'O' && line_cnt!=0){
                    m[j]++;
                    result = "no";
                }else if(rook[i][j] == 'O' && m[j]>1){
                    result = "no";
                }
            }
        }
        if(cnt!=8) result = "no";
        cout<<"#"<<tc<<" "<<result<<"\n";
    }

    return 0;
}