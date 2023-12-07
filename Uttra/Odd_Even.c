#include<stdio.h>
int main(){
    int n;
    printf("Enter a positive number: ");
    scanf("%d",&n);
    if(n<=0){
        printf("Not a valid positive integer!!!");
    }else{
        if(n%2==0){
            printf("Even");
        }else{
            printf("Odd");
        }
    }
}