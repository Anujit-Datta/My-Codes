#include<bits/stdc++.h>
using namespace std;
int main(){
    int top=-1,max;
    cout<<"Enter the max size of Stack: ";
    cin>>max;
    int sa[max];
    int c=0;
    for(int j=0; c!=4; j++){
    cout<<"\n1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice: ";
    cin>>c;
    if(c==1){
        if(top==max-1){
        cout<<"Stack overflow\n";
        }
        else{
        top+=1;
        cout<<"Element to push: ";
        cin>>sa[top];
        cout<<"\n";
        }
    }
    else if(c==2){
        if(top==-1){
        cout<<"Stack underflow\n";
        }
        else{
        top-=1;
        cout<<"Popped element: "<<sa[top+1]<<"\n";
        }
    }
    else if(c==3){
        if(top==-1){
        cout<<"Stack is empty\n";
    }
        else{
        cout<<"Current stack: ";
        for(int i=0; i<=top; i++){
            cout<<sa[i]<<' ';
        }
        cout<<"\n";
        }
    }
    }
    cout<<"Exited\n";
    return 0;

}