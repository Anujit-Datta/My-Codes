import java.util.*;
public class RPS {
    static Scanner in=new Scanner(System.in);
    static Random R=new Random();
    static int prev=0;
    static int comb=1,score=0;

    static int N(int curr){
        if(curr==1 && prev==1){
            comb=comb*2;
            return comb;
        }
        else if(curr==2 && prev==2){
            if(comb==1){
                comb=-2;
            }
            else{
                comb-=1;
            }
            return comb;
        }
        else{
            comb=1;
            prev=curr;
            return comb;
        }
    }

    static void LOSE(){
        if(N(2)==1){
            System.out.println("\t\t\tLOSE");
            score-=1;
        }
        else{
            System.out.println("\t\t\tLOSE\tScore("+comb+")");
            score=score-comb;
        }
    }

    static void WIN(){
        if(N(1)==1){
            System.out.println("\t\t\tWIN");
            score+=1;
        }
        else{
            System.out.println("\t\t\tWIN\tScore(+"+comb+")");
            score=score+comb;
        }
    }

    public static void main(String[] args){
        System.out.print("\t\tROCK-PAPER-SCISSORS\n\t\t  No. of Terms: ");
        int it=in.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.println("\t\tROCK-PAPER-SCISSORS\n\t\t r     p      s\n");
        for(int i=0; i<=it; i++){
            if(i==it){String str=in.nextLine(); break;}
            String choice="rps";
            char comD=choice.charAt(R.nextInt(3));
            System.out.print("\tYour call: ");
            String str=in.next();
            char playD=str.charAt(0);

            if(playD==comD){
                System.out.println("\t\t\tTIE");
                prev=0;
                comb=1;
                
            }
            else{
                if(playD=='r'){
                    if(comD=='p'){
                        LOSE();
                    }
                    else{
                        WIN();
                    }
                }
                else if(playD=='p'){
                    if(comD=='r'){
                        WIN();
                    }
                    else{
                        LOSE();
                    }
                }
                else if(playD=='s'){
                    if(comD=='r'){
                        LOSE();
                    }
                    else{
                        WIN();
                    }
                }
            }
            
        }
        in.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("\t\tROCK-PAPER-SCISSORS\n\t\t\tScore: "+score);
        
    }
}
