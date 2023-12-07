import java.util.Scanner;
public class shape {
    static Scanner in=new Scanner(System.in);

    static void area(float f,double d){
        System.out.println("Area of Rectangle: " + (f*d));
    }
    static void area(float r){
        System.out.println("Area of Circle: " + (3.1416*r*r));
    }
    static void area(double d,float f){
        System.out.println("Area of Tringle: " + (0.5*(f*d)));
    }

    public static void main(String[] args){
        int d=0;
        System.out.println("Area Calculation of different shapes:");
        while(d!=4){
            System.out.println(" 1. Ractange\n 2. Circle\n 3. Tringle\n 4. Exit");
            System.out.print(" Enter your choice: ");
            d=in.nextInt();
            if(d==1){
                System.out.print("Enter Length & Width: ");
                float f=in.nextFloat();
                double D=in.nextDouble();
                area(f,D);
            }
            else if(d==2){
                System.out.print("Enter Radius: ");
                float f=in.nextFloat();
                area(f);
            }
            else if(d==3){
                System.out.print("Enter Base & Height: ");
                double D=in.nextDouble();
                float f=in.nextFloat();
                area(D,f);
            }
        }
    }
}
