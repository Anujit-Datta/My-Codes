import java.util.*;
public class selection_sort {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        System.out.print("Enter Array elements: ");
        for(int i=0; i<n; i++){
            list.add(in.nextInt());
        }

        for (int i = 0; i < n-1; i++){
            int mini=i;
            for (int j = i+1; j < n; j++){
                if (list.get(j) < list.get(mini)){
                    mini=j;
                }
            }
            int temp = list.get(mini);
            list.set(mini,list.get(i));
            list.set(i,temp);
        }
        System.out.println("Sorted array elements: "+list);
        in.close();
    }
}
