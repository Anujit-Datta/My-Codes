
import java.util.Scanner;
public class Stack_lab {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int top=-1,max,c=0;
        System.out.print("Enter the max size of Stack: ");
        max=in.nextInt();
        int ST[]=new int[max];
        
        while(c!=3){
            System.out.print("\n1.Push\t2.Pop\t3.Exit\nInput your choice: ");
            c=in.nextInt();
            if(c==1){
                if(top==(max-1)){
                    System.out.println("Satck Overflow!");
                    
                }
                else{
                    top+=1;
                    System.out.print("Enter Item to push: ");
                    ST[top]=in.nextInt();
                }
            }
            else if(c==2){
                if(top==(-1)){
                    System.out.print("Stack Underflow!\n");
                }
                else{
                    top-=1;
                    System.out.println("Popped Element: "+ST[top+1]);
                }
            }
            System.out.println();
            System.out.print("Current Stack: ");
            for(int i=0; i<=top; i++){System.out.print(ST[i]+" ");}
        }
        System.out.print("\nExited");
        in.close();
    }
}
