#include<stdio.h>
void main(){
    FILE *f;
    char s[100];
    f=fopen("test.txt","r");
    printf("The content of the file test.txt is:\n");
    puts(fgets(s,100,f));
    fclose(f);
}