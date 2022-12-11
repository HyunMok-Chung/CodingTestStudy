#include<iostream>
#include<string>
using namespace std;

// 두문자어 (D3)

int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    string word;
    int t;
    cin>>t;

    for(int i=1;i<=t;i++){
        char check[3];
        for(int j=0;j<3;j++){
            cin>>word;
            check[j] = word[0]-32;
        }
        cout<<"#"<<i<<" ";
        for(int j=0;j<3;j++)
            cout<<check[j];
        cout<<"\n";
    }
    return 0;
}