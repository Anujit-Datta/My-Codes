#include<stdio.h>
typedef struct SS{
    char name[100];
    int roll;
    float marks;
}data;
int main(){
    int n;
    printf("Number of students: ");
    scanf("%d",&n);
    data student[n];
    for(int i=0; i<n; i++){
        getchar();
        printf("Student-%d:\n Name: ",i+1);
        gets(student[i].name);
        printf(" Roll: ");
        scanf("%d",&student[i].roll);
        printf(" Marks: ");
        scanf("%f",&student[i].marks);
    }
    printf("\nOutput:-");
    for(int i=0; i<n; i++){
        printf("\n Student-%d:\n  Name: ",i+1);
        puts(student[i].name);
        printf("  Roll: %d\n  Marks: %.2f",student[i].roll,student[i].marks);
    }
    return 0;
}
