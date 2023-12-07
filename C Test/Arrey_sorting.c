#include<stdio.h>
int main(){
    FILE *f;
    int n,d;
    printf("Number of inputs in arrey: ");
    scanf("%d",&n);
    int a[n];
    for(int k=0; k<n; k++){
        scanf("%d",&a[k]);
    }
    f=fopen("test.txt","w");
    for(int i=0; i<n-1; i++){
        int t=a[i];
        d=i;
        for(int j=i+1; j<n; j++){
            if(a[j]<t){
                t=a[j];
                d=j;
            }
        }
        a[d]=a[i];
        a[i]=t;
    }
    for(int k=0; k<n; k++){
        fprintf(f,"%d ",a[k]);
    }
    fclose(f);
    printf("Done");
    return 0;
}
