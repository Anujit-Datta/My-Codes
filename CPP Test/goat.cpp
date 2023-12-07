#include<bits/stdc++.h>
using namespace std;
struct str{
    char s[21];
};
int main(){
    int n,h;
    cin>>n;
    int size[n];
    str A[n];
    for(int i=0; i<n; i++){
        cin>>A[i].s;
        size[i]=strlen(A[i].s);
    }
    h=size[0];
    for(int i=1; i<n; i++){
        if(size[i]>h){
            h=size[i];
        }
    }
    for(int i=0; i<n; i++){
        int l=strlen(A[i].s);
        if((l-1)%2!=0){
            if(l==2){
                A[i].s[2]='a';
                A[i].s[3]='\0';
                l=strlen(A[i].s);
                for(int j=0; j<(((h-1)/2)-((l-1)/2)); j++){
                    cout<<' ';
                }
                cout<<A[i].s;
            }
            else{
                A[i].s[l-1]='\0';
                l=strlen(A[i].s);
                for(int j=0; j<(((h-1)/2)-((l-1)/2)); j++){
                    cout<<' ';
                }
                cout<<A[i].s;
            }
        }
        else{
           for(int j=0; j<(((h-1)/2)-((l-1)/2)); j++){
                    cout<<' ';
                }
                cout<<A[i].s; 
        }
        cout<<"\n";
    }
return 0;
}