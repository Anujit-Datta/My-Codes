#include<bits/stdc++.h>
using namespace std;
int fact(int n){
    if(n==0) {return 1;}
    else if(n==1) {return n;}
    else{return (n*fact(n-1));}
}
int main(){
    int a;
    cin>>a;
    cout<<fact(a);
    return 0;
}