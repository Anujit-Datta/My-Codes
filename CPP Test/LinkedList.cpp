#include<iostream>
using namespace std;
struct node{
    int D;
    node* N;
};
struct node *head=NULL;

void insertH(int item){
    if(head==NULL){
        head->D=item;
        head->N=NULL;
    }
    else{
        struct node *temp;
        temp=head;
        head->D=item;
        head->N=temp->N;
    }
    cout<<head->D<<head->N;
    return;
}

void insertT(int item){
    if(head==NULL){
        head->D=item;
        head->N=NULL;
    }
    else{
        struct node *temp=head;
        struct node *n;
        while(temp->N!=NULL){
            temp->N=temp->N->N;
        }
        n->D=item;
        n->N=NULL;
        temp->N=n;
    }
    return;
}

void insertM(int item){
    struct node *n;
    struct node *temp=head;
    int Litem;
    cout<<"insert after item: ";
    cin>>Litem;
    while(temp->D!=Litem){
        temp->N=temp->N->N;
    }
    return;
}

void display(){
    if(head==NULL){
        cout<<"Linked list is empty";
    }
    else{
        struct node *temp=head;
        while(temp->N!=NULL){
            cout<<temp->D<<" ";
            temp->N=temp->N->N;
        }
        cout<<temp->D<<" ";
    }
    return;
}

int main(){
    int item,d=0;
    while(d!=6){
    cout<<"1. Insert at Head:\n2. Insert at Middle:\n3. Insert at Tail:\n4. Display\n6. Exit\nEnter your choice no:";
    cin>>d;
    if(d==1){
        cout<<"Enter item: ";
        cin>>item;
        insertH(item);
    }
    else if(d==2){
        cout<<"Enter item: ";
        cin>>item;
        insertM(item);
    }
    else if(d==3){
        cout<<"Enter item: ";
        cin>>item;
        insertT(item);
    }
    else if(d==4){
        display();
    }
}

}