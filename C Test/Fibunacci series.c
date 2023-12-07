#include<stdio.h>
main()
{
    int a=0,b=1,n,N;
    scanf("%d",&n);
    if(n==1)
        printf("1");
    else{
            printf("1");
    for(int i=2;i<=n;i++)
    {
        N=a+b;
        a=b;
        b=N;
        printf(",%d",N);
    }

    }
    return 0;

}
