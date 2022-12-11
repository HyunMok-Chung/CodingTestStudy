#include<iostream>
using namespace std;

// 초심자의 회문 검사 (D2)

int main(){
    int t;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        string word;
        cin>>word;
        int cnt = 0;
        int num = word.length();

        for(int j=0;j<num/2;j++){
            if(word[j] == word[num-1-j])
                cnt++;
        }

        if(cnt == num/2)
            printf("#%d 1\n", i);
        else
            printf("#%d 0\n", i);
    }

    return 0;
}