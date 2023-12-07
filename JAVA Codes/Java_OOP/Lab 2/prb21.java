import java.util.Scanner;
public class prb21{
    static Scanner in=new Scanner(System.in);
    static void intypes(int i){
        System.out.println("Integer: "+i);
    }
    static void intypes(float f){
        System.out.println("Float: "+f);
    }
    static void intypes(String s){
        System.out.println("String: "+s);
    }
    public static void main(String[] args){
        System.out.print("1 for integer\n2 for float\n3 for string\n Enter your choice:");
        int d=in.nextInt();
        if(d==1){
            System.out.print("Enter an integer: ");
            int i=in.nextInt();
            intypes(i);
        }
        else if(d==2){
            System.out.print("Enter a float: ");
            float f=in.nextFloat();
            intypes(f);
        }
        else{
            System.out.print("Enter a string: ");
            String s;
            in.nextLine();
            s=in.nextLine();
            intypes(s);
        }
    }
}