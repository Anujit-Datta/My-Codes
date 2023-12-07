#include<stdio.h>
main()
{
    int td=1329,m,d,Y,M;
    m=1329%365;
    Y=(1329-m)/365;
    d=m%7;
    M=(m-d)/7;
    printf("Years=%d\n",Y);
    printf("Months=%d\n",M);
    printf("Days=%d",d);
    return(0);

}
