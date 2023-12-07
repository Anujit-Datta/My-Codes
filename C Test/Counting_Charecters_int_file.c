#include<stdio.h>
main(){
    int lw=0,up=0,d=0,sp=0,sc=0,ln=1;
    char c;
    FILE *f;
    f=fopen("text.txt","r");
    while(c!=EOF){
        c=getc(f);
        if(c>='a' && c<='z'){
            lw+=1;
        }
        else if(c>='A' && c<='Z'){
            up+=1;
        }
        else if(c>='0' && c<='9'){
            d+=1;
        }
        else if(c==' '){
            sp+=1;
        }
        else if(c=='\n'){
            ln+=1;
        }
        else{sc+=1;}
    }
    printf("Lowercase letter: %d\nUppercase letter: %d\nDigit: %d\nSpace: %d\nLine: %d\nOthers: %d",lw,up,d,sp,ln,sc);
    fclose(f);
    return 0;
}