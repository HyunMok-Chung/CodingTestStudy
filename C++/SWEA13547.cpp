#include<iostream>
using namespace std;

//팔씨름 (D3)

int main(){
    int t, win, lose;
    string record;

    scanf("%d", &t);
    for(int i=0;i<t;i++){
        win = 0;
        lose = 0;
        cin>>record;

        for(int j=0;j<record.length();j++){
            if(record[j] == 'o'){
                win++;
            }else if (record[j] == 'x'){
                lose++;
            }
        }
        if(win >= 8 || lose<=7)
            printf("#%d YES\n", i+1);
        else
            printf("#%d NO\n", i+1);
    }

    return 0;
}