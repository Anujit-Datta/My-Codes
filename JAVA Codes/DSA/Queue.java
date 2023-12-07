import java.util.*;
public class Queue {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int c=0;
        ArrayList<Integer> Q=new ArrayList<>();
        while(true){
            System.out.print("1.Enqueue\t2.Dequeue\t3.Exit\nEnter your choice: ");
            c=in.nextInt();
            if(c==1){
                System.out.print("Enter Element to Enqueue: ");
                Q.add(in.nextInt());
            }
            else if(c==2){
                System.out.println("Element that Dequeued: "+Q.get(0));
                
                Q.remove(0);
            }
            else if(c==3){
                System.out.println("Exited");
                break;
            }
            if(Q.size()==0){
                System.out.println("Current Queue: [Empty]\n");
                continue;
            }
            System.out.println("Current Queue: "+Q);
            System.out.println();
        }
        in.close();
    }
}
