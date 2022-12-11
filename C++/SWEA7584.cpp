#include<iostream>
#include<algorithm>
#include<string>
using namespace std;

//자가 복제 문자열 (D3) 다 못 품

int main(){
    int t;
    long long k;
    string p = "0";
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        k=0;
        scanf("%d", &k);
        while(p.length()<=k){
            string rev_p = p;
            p+="0";
            reverse(rev_p.begin(), rev_p.end());
            for(int j=0;j<p.length();j++){
                if(rev_p[j]=='0')
                    rev_p[j]='1';
                else
                    rev_p[j]='0';
            }
            p+=rev_p;
        }
        cout<<"#"<<i<<" "<<p[k-1]<<"\n";
    }

    return 0;
}