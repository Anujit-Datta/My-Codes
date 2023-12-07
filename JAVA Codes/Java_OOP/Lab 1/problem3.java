import java.util.Scanner;
public class problem3 {
    static int length,breadth;
    static void setvalue(int l,int b){
        length=l;
        breadth=b;
    }
    static int getarea(){
        return (length*breadth);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Length: ");
        int a=in.nextInt();
        System.out.print("Enter Breadth: ");
        int b=in.nextInt();
        setvalue(a,b);
        System.out.println("Area: "+getarea());
        in.close();
    }
}
