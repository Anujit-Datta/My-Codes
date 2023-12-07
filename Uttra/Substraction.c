#include<stdio.h>
int main(){
    int a,b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a,&b);
    if(a>b){
        printf("Substraction: %d", a-b);
    }else{
        printf("Substraction: %d", b-a);
    }
}