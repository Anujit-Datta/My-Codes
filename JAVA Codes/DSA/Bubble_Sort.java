import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("For sorting integers 'i'\nFor Sorting charecters 'c'\nEnter your choice: ");
    char ch=input.next().charAt(0);
    System.out.print("Enter amount of elements: " );
    int n=input.nextInt();
    int A[]=new int[n];
    char S[]=new char[n];

    if(ch=='i'){
        System.out.print("Enter integers to sort: ");
        for(int i=0; i<n; i++){
            A[i]=input.nextInt();
        }
        for(int i=0; i<(n-1); i++){
            for(int j=0; j<(n-i-1); j++){
                if(A[j]>A[j+1]){
                    int t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
            }
        }
        System.out.print("Sorted Integers: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+ " ");
        }
    }
    else if(ch=='c'){
        System.out.print("Enter charectrs to sort: ");
        for(int i=0; i<n; i++){
            S[i]=input.next().charAt(0);
        }
        for(int i=0; i<(n-1); i++){
            for(int j=0; j<(n-i-1); j++){
                if(S[j]>S[j+1]){
                    char t=S[j];
                    S[j]=S[j+1];
                    S[j+1]=t;
                }
            }
        }
        System.out.print("Sorted charecters: ");
        System.out.print(S);
    }
    System.out.print("\n");
input.close();
}
}
