import java.util.*;
public class HI_LO{
    static Scanner in=new Scanner(System.in);
    static Random R=new Random();
    static int a,b,c,s=0,N=0;

    static void Dif(){
        System.out.println("\t\tThis is an HI-LO based number gussing game: ");
        System.out.print("\t\tChoose your difficulty level: \n\t\t\t1.Easy\n\t\t\t2.Medium\n\t\t\t3.Hard\n\t\tEnter your choice: " );
        int d=in.nextInt();
        if(d==1){
            a=250;
            b=125;
            c=50;
        }
        else if(d==2){
            a=50;
            b=37;
            c=25;
        }
        else if(d==3){
            a=25;
            b=12;
            c=5;
        }
        return;
    }

    static void score(int dif){
        if(dif>a){
            s-=1;
        }
        else if(dif<=a && dif>b){
        }
        else if(dif<=b && dif>c){
            s+=1;
        }
        else{
            s+=2;
        }
    }
    public static void main(String[] args){
        Dif();
        System.out.print("\033[H\033[2J");
        System.out.println("\t\tThis is an HI-LO based number gussing game: \n\t\tRandom number genareted between(0-1000)!!");
        int r=R.nextInt(1000);

        while(true){
            System.out.print("\t\tYour Guess: ");
            int n=in.nextInt();
            N+=1;
            score(Math.abs(r-n));
            if(n<r){
                System.out.println("\t\tLow\tAttempt no: "+N);
            }
            else if(n>r){
                System.out.println("\t\tHigh\tAttempt no: "+N);
            }
            else{
                System.out.println("\t\tCongratulations\n\t\tYou guessed the number!!");
                break;
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.println("\t\tThis is an HI-LO based number gussing game: \n\t\t\t\tAttempts: "+N+"\n\t\t\t\tScore:    "+s);
        
        
    }
}
