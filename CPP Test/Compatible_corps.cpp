#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,n,count=0;
    cin>>m>>n;
    char A[m+1][n+1];
    for(int i=0; i<=m; i++){
        for(int j=0; j<=n; j++){
            if(i==m || j==n){
                A[i][j]='.';
            }
            else
                cin>>A[i][j];
        }
    }
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(A[i][j]=='.'){
                if(A[i-1][j]!='*' && A[i+1][j]!='*' && A[i][j-1]!='*' && A[i][j+1]!='*' ){
                    count+=1;
                }
            }
        }
    }
    cout<<count;
    return 0;
}