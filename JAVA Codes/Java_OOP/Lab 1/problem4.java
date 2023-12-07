
import java.util.Scanner;
public class problem4 {
    static void avg(int a,int b,int c){
        float average=(a+b+c)/3;
        System.out.println("Average: "+average);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        avg(a,b,c);
        in.close();
    }

}
