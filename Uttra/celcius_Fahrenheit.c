#include<stdio.h>
int main(){
    float a;
    printf("Celcius temperature: ");
    scanf("%f",&a);
    printf("Fahrenheit: %f", ((9*a)/5)+32);
}