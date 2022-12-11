#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    string word;
    int t, cnt;
    cin>>t;
    for(int i=1;i<=t;i++){
        string result;
        cnt=0;
        cin>>word;
        sort(word.begin(), word.end());
        for(int j=0;j<word.length();j++){
            if(word[j] == word[j+1])
                j++;
            else{
                result += word[j];
                cnt++;
            }
        }
        if(cnt==0)
            cout<<"#"<<i<<" Good\n";
        else
            cout<<"#"<<i<<" "<<result<<"\n";
    }
    return 0;
}