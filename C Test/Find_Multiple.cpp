#include<bits/stdc++.h>
using namespace std;

int main(){
    int A,B,C,M;
    cin>>A>>B>>C;
    M=C;
    for(int i=2; i<=1000; i++){
        if(M<=B && M>=A){
            cout<<M;
            return 0;
        }
        else if(M>B){
            cout<<-1;
            return 0;
        }
        else{
            M=C*i;
        }
    }
    return 0;
}