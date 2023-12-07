import java.util.Scanner;
import java.util.Arrays;
public class Binary_Search{
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter size: ");
    int n=in.nextInt(),H,L=0,M,item,o=(-1);
    int A[]=new int[n];
    System.out.print("Enter elements: ");
    for(int i=0; i<n; i++){
        A[i]=in.nextInt();
    }
    Arrays.sort(A); 
    H=(n-1); 
    M=(L+H)/2;
    System.out.print("Sorted elements: ");
    for(int i=0; i<n; i++){
        System.out.print(" "+ A[i]);
    }
    System.out.print("\nEnter item to search: ");
    item=in.nextInt();
    in.close();
    while(L<=H){
        if(A[M]==item){ o=M; break; }
        else if(A[M]<item){ L=(M+1); }
        else{ H=(M-1); }
        M=(L+H)/2;
    }
    if(o>=0)
        System.out.println( "Found at position: " + (M+1));
    else
        System.out.println("Not Found");
}
}
