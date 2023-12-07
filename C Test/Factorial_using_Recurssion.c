#include <stdio.h>
void main(){
	FILE *fp;
	char c;
	fp=fopen("sample.txt", "r");
	if(fp==NULL){
		printf("File Opening Failed\n");
		return;
	}
	printf("The content of the file sample.txt is:\n");
	while ((c=fgetc(fp))!=EOF){
		printf ("%c",c);
	}
	fclose(fp);
	return;
}

