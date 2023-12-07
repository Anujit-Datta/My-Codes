import java.util.Scanner;
public class Animal {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        Dog obd=new Dog();
        Cat obc=new Cat();
        obd.makeSound();
        obc.makeSound();
    }
    void makeSound(){
        System.out.print("This Animal Sounds: ");
    };
}
class Dog extends Animal{
    void makeSound(){
        super.makeSound();
        System.out.println("Bark...");
    }
    void call(){
        super.makeSound();
    }
}
class Cat extends Animal{
    void makeSound(){
        super.makeSound();
        System.out.println("Mewoo...");
    }
    void call(){
        super.makeSound();
    }
}


