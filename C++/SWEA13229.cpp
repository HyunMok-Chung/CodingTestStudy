#include<iostream>
using namespace std;

// 일요일 (D3)

int main(){
    int t, num;
    scanf("%d", &t);
    for(int i=1;i<=t;i++){
        string day;
        num=0;
        cin>>day;
        if(day == "SUN")
            num=0;
        else if (day == "SAT")
            num=6;
        else if (day == "FRI")
            num=5;
        else if (day == "THU")
            num=4;
        else if (day == "WED")
            num=3;
        else if (day == "TUE")
            num=2;
        else
            num=1;
        printf("#%d %d\n", i, 7-num);
    }
    return 0;
}