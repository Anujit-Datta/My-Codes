#include<bits/stdc++.h>
using namespace std;
int ilen(int n){
    int d=0;
    for(int i=10; i<=1000000; i*=10)
    if(n<i){
        d+=1;
        break;
    }
    else{
        d+=1;
    }
return d;
}

int main(){
    int a,b,x,y,D;
    cin>>a>>b;
    if(a>b)
        D=ilen(b);
    else
        D=ilen(a);
    for(int i=1; i<=D; i++){
        if((a%10)+(b%10)>=10){
            cout<<"Yes";
            return 0;
        }
        else{
            a=a/10;
            b=b/10;
        }
    }
    cout<<"No";    
    return 0;

}