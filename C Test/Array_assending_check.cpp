#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,N[100];
    cin>>n;
    if(n==1){
        cout<<"Yes";
        return 0;
    }
    for(int i=0; i<n; i++){
        cin>>N[i];
    }
    if(n==1){
        cout<<"Yes";
        return 0;
    }
    for(int j=1; j<n; j++){
        if(N[j]<N[j-1]){
            cout<<"No";
            return 0;
        }
    }
    cout<<"Yes";
    return 0;
}