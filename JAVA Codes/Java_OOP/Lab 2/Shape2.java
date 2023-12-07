import java.util.Scanner;
public class Shape2{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Area calculation for different shapes: \n 1.Rectangle\n 2.Circle\n Entert choice: ");
        int d=in.nextInt();
        if(d==1){
            Rec obr=new Rec();
            System.out.print("Enter height & width: ");
            obr.calcArea(in.nextFloat(),in.nextFloat());
        }
        else if(d==2){
            Cir obc=new Cir();
            System.out.print("Enter redius: ");
            obc.calcArea(in.nextFloat());
        }
    }
    void calcArea(float a){
        System.out.println("Area: " + a);
    }
}
class Rec extends Shape2{
    void calcArea(float h,float d){
        super.calcArea((h*d));
    }
}
class Cir extends Shape2{
    void calcArea(float r){
        super.calcArea((float) (3.1416*r*r));
    }
}
