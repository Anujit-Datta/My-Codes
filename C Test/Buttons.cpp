#include<bits/stdc++.h>
using namespace std;

int main(){
    int a,b,aa,bb,ab;
    cin>>a>>b;
    aa=a+(a-1);
    bb=b+(b-1);
    ab=a+b;
    if(aa>bb && aa>ab)
        cout<<aa;
    else if(bb>aa && bb>ab)
        cout<<bb;
    else
        cout<<ab;
    
    return 0;
}