#include<iostream>
#include<string>
using namespace std;

//안경이 없어! (D3)

int main(){
    string whole = "ADOPQR";
    int t, a_num, b_num, cnt;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        string a, b;
        a_num=0; b_num=0; cnt=0;
        cin>>a>>b;

        if(a.length() != b.length()){
            printf("#%d DIFF\n", i);
            continue;
        }

        for(int j=0;j<a.length();j++){
            if(a[j] == 'B' && b[j] == 'B')
                continue;
            else if(a[j]=='B' &&b[j]!='B' || a[j]!='b' && b[j]=='B'){
                cnt++;
                break;
            }
            for(int k=0;k<6;k++){
                if(a[j] == whole[k])
                    a_num++;
                if(b[j] == whole[k])
                    b_num++;
            }
            if(a_num != b_num){
                cnt++;
                break;
            }
        }
        if(cnt>0)
            printf("#%d DIFF\n", i);
        else
            printf("#%d SAME\n", i);
    }

    return 0;
}