#include<bits/stdc++.h>
using namespace std;

int main(){
    int a=0,b=0,c=0,s,k,C=0,d;
    cin>>k>>s;
    for(a=k; a>=0; a--){
        for(b=k; b>=0; b--){
            c=(s-a-b);
            if(c<=k && (a+b)<=s){
                
                    C+=1;
                }
            
        }
    }
    cout<<C;
    return 0;
}