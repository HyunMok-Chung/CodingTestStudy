#include<iostream>
#include<string>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int t;
    cin>>t;

    for(int i=1;i<=t;i++){
        string word;
        string result;
        cin>>word;
        for(int j=0;j<word.length();j++){
            if(word[j]!='a' && word[j]!='e' && word[j]!='i' && word[j]!='o' && word[j]!='u'){
                result+=word[j];
            }
        }
        cout<<"#"<<i<<" "<<result<<"\n";
    }

    return 0;
}