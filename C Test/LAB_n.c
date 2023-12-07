#include<stdio.h>
#include<string.h>
typedef struct student{
    int r;
    char n[50],a[100];
    float m;
}str;
int main(){
    str a={5,"anujit","datta",5.5};
    printf("%d %s %f",a.r,a.n,a.m);
    return 0;
}