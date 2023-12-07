#include<bits/stdc++.h>
using namespace std;
struct ss{
char S[100];
int ball,over;
};
void balls(int a){
    if(a==1){
        cout<<"1 BALL"<<endl;
    }
    else if(a>1){
        cout<<a<<" BALLS"<<endl;
    }
    else if(a==0){
        cout<<endl;
    }
    return;
}
int main(){
    int T,i;
    cin>>T;
    struct ss SS[T];
    for(i=0; i<T; i++){
        cin>>SS[i].S;
        char S1[100];
        strcpy(S1,SS[i].S);
        int b=strlen(S1);
        for(int j=0; j<strlen(S1); j++){
            if(S1[j]=='W' || S1[j]=='D' || S1[j]=='N'){
                b-=1;
            }
        }
        SS[i].over=b/6;
        SS[i].ball=b%6;
    }
    for(i=0; i<T; i++){
        if(SS[i].over==0){
            balls(SS[i].ball);
        }
        else if(SS[i].over==1){
            cout<<"1 OVER ";
            balls(SS[i].ball);
        }
        else{
            cout<<SS[i].over<<" OVERS ";
            balls(SS[i].ball);
        }
    }
    return 0;
}
