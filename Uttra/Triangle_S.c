#include<stdio.h>
#include<math.h>
int main(){
    float a,b,c;
    printf("Enter the edges of triangle: ");
    scanf("%f %f %f",&a,&b,&c);
    float s=(a+b+c)/2;
    printf("Area: %f", sqrt(s*(s-a)*(s-b)*(s-c)));
}