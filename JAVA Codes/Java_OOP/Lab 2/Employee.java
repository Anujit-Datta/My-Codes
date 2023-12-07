import java.util.Scanner;
public class Employee {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Salary you want to know: \n 1.Manager\n 2.Salesperson\n Entert choice: ");
        int d=in.nextInt();
        if(d==1){
            manager obj=new manager();
            obj.calculateSalary();
        }
        else if(d==2){
            Salesperson obj=new Salesperson();
            obj.calculateSalary();
        }
    }
    void calculateSalary(String i){
        System.out.print("The salary of "+i);
    }
}
class manager extends Employee{
    void calculateSalary(){
        super.calculateSalary("Manager= 50000");
    }
}
class Salesperson extends Employee{
    void calculateSalary(){
        super.calculateSalary("Salesperson= 30000");
    }
}
