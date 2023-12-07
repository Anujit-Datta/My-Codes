#include<bits/stdc++.h>
using namespace std;
void loop(int l,int h){
    int count=0;
    for(int i=l; i<=h; i++){
        count+=1;
    }
    cout << count;
}
int main(){
    int a,b;
    cin >>a >> b;
    if(a>b){
        cout << 0;
    }
    else if(b>a){
        loop(a,b);
    }
    else{
        cout<<1;
    }
}