#include<stdio.h>
int main(){
    float a,b;
    printf("Enter 2 integer numbers: ");
    scanf("%f %f",&a,&b);
    printf("Summation: %f\n", a+b);
    if(a>b){
        printf("Substraction: %f\n", a-b);
    }else{
        printf("Substraction: %f\n", b-a);
    }
    printf("Multiplication: %f\n", a*b);
    if(a>b){
        printf("Division: %f\n", a/b);
    }else{
        printf("Division: %f\n", b/a);
    }
}