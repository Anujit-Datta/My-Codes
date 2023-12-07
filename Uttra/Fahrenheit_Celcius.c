#include<stdio.h>
int main(){
    float a;
    printf("Fahrenheit temperature: ");
    scanf("%f",&a);
    printf("Celcius: %f", ((a-32)*5)/9);
}