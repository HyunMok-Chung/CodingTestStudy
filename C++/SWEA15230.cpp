#include<iostream>
using namespace std;

//알파벳 (D3)

int main(){
    int t, cnt;
    string alpha;

    scanf("%d", &t);

    for(int i=0;i<t;i++){
        cnt = 0;
        cin>>alpha;
        for(int j=0;j<alpha.length();j++){
            if(alpha[j] == 'a'+j){
                cnt++;
            }else break;
        }
        printf("#%d %d\n", i+1, cnt);
    }

    return 0;
}