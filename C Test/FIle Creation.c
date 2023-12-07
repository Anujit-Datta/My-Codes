#include<stdio.h>
void main(){
    FILE *f;
    f=fopen("test.txt","w");
    fprintf(f,"This is the content of the file test.txt");
    printf("The file test.txt created successfully...!! ");
    fclose(f);

}