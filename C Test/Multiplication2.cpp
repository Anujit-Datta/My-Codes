#include<bits/stdc++.h>
using namespace std;

int main(){
    int N, a=-1;
    cin>>N;
    long long int A[100000],M=1;
    for(int i=0; i<=N-1; i++){
        cin >> A[i];
    }
    for(int j=0; j<=N-1; j++){
        M=M*A[j];
        if(M>1000000000000000000 || M<0){
            cout << a;
            return 0;
        }
    }
    cout<< M;
    return 0;
}