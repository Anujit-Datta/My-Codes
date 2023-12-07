#include<bits/stdc++.h>
using namespace std;
void num(){
    int n,t;
    cout<<"Enter amount of numbers: ";
    cin>>n;
    cout<<"Enter numbers: ";
    int A[n];
    for(int i=0; i<n; i++){
        cin>>A[i];
    }
    for(int i=0; i<(n-1); i++){
            for(int j=0; j<(n-i-1);j++){
                if(A[j]>A[j+1]){
                    t=A[j+1];
                    A[j+1]=A[j];
                    A[j]=t;
            }
        }
    }
    cout<<"Sorted numbers: ";
    for(int i=0; i<n; i++){
        cout<<A[i]<<" ";
    }
}

void word(){
    int n;
    cout<<"Enter word size: ";
    cin>>n;
    char C[n],t;
    cout<<"Enter word: ";
    cin>>C;
    for(int i=0; i<n; i++){
        for(int j=0; j<(n-i-1); j++){
            if(C[j]>C[j+1]){
            t=C[j+1];
            C[j+1]=C[j];
            C[j]=t;
            }
        }
    }
    cout<<"Sorted Word: "<<C;


}

int main(){
    char d;
    cout<<"'w' for words\n'n' for number\n Enter your choice: ";
    cin>>d;
    if(d=='w'){
        word();}
    else if(d=='n'){
        num();}
    return 0;
}
