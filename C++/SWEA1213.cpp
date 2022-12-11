#include<iostream>
using namespace std;

// SW 문제해결 기본 3일차 String (D3)

int main(){
    int tc_num, cnt;
    string sample, compare;

    for(int i=0;i<10;i++){
        cnt = 0;

        scanf("%d", &tc_num);
        cin >> sample;
        cin >> compare;
        for(int j=0;j<compare.size();j++){
            if(sample == compare.substr(j,sample.size())){  //substr = 문자열 뽑아주는 라이브러리 / 형식 : 문자열.substr(시작 인덱스, 원하는 길이)
                cnt++;
            }
        }

        printf("#%d %d\n", tc_num, cnt);
    }
    return 0;
}