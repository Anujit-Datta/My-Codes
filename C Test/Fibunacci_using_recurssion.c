#include<stdio.h>
int a=0, b=1,n,sum=1,N;
int fib(int n){
    if(n>2){
        N=a+b;
        printf(" %d",N);
        a=b;
        b=N;
        sum=sum+N;
        fib(n-1);
    }
    return sum;
    
    
}
main(){
    printf("Enter the term range: ");
    scanf("%d",&n);
    if(n==1){
        printf("0 \nSum= 0");
        return 0;
    }
    else if(n==2){
        printf("0 1 \nSum= 1");
        return 0;
    }
    else if(n==0){
        printf("Null\nSum= 0");
    }
    else{
        printf("%d %d",a,b);
        printf("\nSum= %d",fib(n));
    }
    
    return 0;
}