#include<stdio.h>
int main(){
    float a,b;
    printf("Enter two numbers: ");
    scanf("%f %f", &a,&b);
    if(a>b){
        printf("Division: %f", a/b);
    }else{
        printf("Division: %f", b/a);
    }
}