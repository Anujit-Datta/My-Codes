import java.util.Scanner;
public class Calculator {
    static Scanner in=new Scanner(System.in);
    static void calc(int i, double d){
        System.out.println("Sum= "+(i+d));
    }
    static void calc(int i,int j){
        System.out.println("Sub: "+(i-j));
    }
    static void calc(double d,double e){
        System.out.println("Multi: "+ (d*e));
    }
    static void calc(double d, int i){
        System.out.println("Div: " + (d/i));
    }
    public static void main(String[] args){
        int a,b;
        double c,e;
        System.out.print(" 1 for Addition\n 2 for Substraction\n 3 for Multiplication\n 4 for Division\nEnter your choice: ");
        int d=in.nextInt();
        if(d==1){
            System.out.print("Enter an integer & a double: ");
            a=in.nextInt();
            c=in.nextDouble();
            calc(a,c);
        }
        else if(d==2){
            System.out.print("Enter two integers: ");
            a=in.nextInt();
            b=in.nextInt();
            calc(a,b);
        }
        else if(d==3){
            System.out.print("Enter two doubles: ");
            c=in.nextDouble();
            e=in.nextDouble();
            calc(c,e);
        }
        else{
            System.out.print("Enter a double & an integer: ");
            c=in.nextDouble();
            a=in.nextInt();
            calc(c,a);
        }
    }
}
