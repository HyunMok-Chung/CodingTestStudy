#include<iostream>
using namespace std;

// 홀수일까 짝수일까 (D3)

int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    int t;
    string num;
    cin>>t;

    for(int i=1;i<=t;i++){
        cin>>num;
        int n = num[num.length()-1];
        if(n%2==0)
            cout<<"#"<<i<<" EVEN"<<"\n";
        else cout<<"#"<<i<<" ODD"<<"\n";
    }

    return 0;
}