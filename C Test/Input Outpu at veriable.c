#include<stdio.h>
main()
{
    int n;
    printf("Enter a number:");
    scanf("%d",&n);
    if(n==0)
        printf("0 is Neutral");
    else if(n%2==0)
        printf("Even");
    else
        printf("ODD");
    return(0);
}
