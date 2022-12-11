#include<iostream>
using namespace std;

// 직사각형과 점 (D3)

int main(){
    int t;
    scanf("%d", &t);

    for(int i=1;i<=t;i++){
        int x1, y1, x2, y2, n;
        int x,y;
        int in_cnt=0;
        int line_cnt=0;
        int out_cnt=0;

        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        scanf("%d", &n);

        for(int j=0;j<n;j++){
            scanf("%d %d", &x, &y);
            if(x>x1 && x<x2 && y>y1 && y<y2){
                in_cnt++;
            }else if((x==x1&&y>=y1&&y<=y2)||(x==x2&&y>=y1&&y<=y2)||(y==y1&&x>=x1&&x<=x2)||(y==y2&&x>=x1&&x<=x2)){
                line_cnt++;
            }else out_cnt++;
        }

        printf("#%d %d %d %d\n", i, in_cnt, line_cnt, out_cnt);
    }

    return 0;
}