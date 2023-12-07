#include<stdio.h>
int main(){
    FILE *f;
    f=fopen("test.txt","w");
    int n;
    printf("Enter pyramid range: ");
    scanf("%d",&n);
    for(int i=0; i<n; i++){
        for(int j=0; j<=i; j++){
            fprintf(f,"%d",i+1);
        }
        fprintf(f,"\n");
    }
    fclose(f);
    printf("Done");
    return 0;
}
