#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

// 두 수의 덧셈 (D3) 다 못 품 문제 이상함

int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    string a, b;
    int t, temp;
    cin>>t;

    for(int i=1;i<=t;i++){
        cin>>a>>b;
        int min_len = min(a.length(), b.length());
        temp = 0;
        for(int j=min_len-1;j>=0;j--){
            char num = a[j] + b[j] - '0' + temp;
            if(num>=10+'0'){
                temp = 1;
                num -= 10;
            } else {
                temp = 0;
            }
            //  99999 1
        }

        char re = a[0]+b[0]-'0';
        cout<<re<<"\n";

    }

    return 0;
}