#include<bits/stdc++.h>
using namespace std;

int main(){
    int N;
    cin>>N;
    cout<<N/1000;
    N=N%1000;
    cout<<N/100;
    N=N%100;
    cout<<N/10;
    cout<<N%10;
    return 0;
}