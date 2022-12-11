#include<iostream>
#include<string>
using namespace std;

//반반 (D3)

int main(){
    int tc;
    string word;

    scanf("%d",&tc);

    for(int i=1;i<=tc;i++){
        char temp=0;
        cin>>word;

        // for(int j=0;j<3;j++){
        //     for(int k=i+1;k<4;k++){
        //         if(int(word[j]) > int(word[k])){
        //             temp = word[j];
        //             word[j] = word[k];
        //             word[k] = temp;
        //         }
        //     }
        // }
        sort(word.begin(), word.end());
        if(word[0] == word[1]){
            if(word[1] != word[2] && word[2] == word[3])
                printf("#%d Yes\n", i);
            else
                printf("#%d No\n", i);
        }else printf("#%d No\n", i);
    }

    return 0;
}