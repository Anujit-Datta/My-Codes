#include<bits/stdc++.h>
using namespace std;

int main(){
    float a,c;
    cin>>a;
    int b=a;
    c=a-b;
    if(c>=0.5)
        cout<<b+1;
    else
        cout<<b;
    return 0;
}