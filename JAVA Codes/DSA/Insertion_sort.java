import java.util.*;
public class Insertion_sort {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        System.out.print("Enter Array elements: ");
        for(int i=0; i<n; i++){
            list.add(in.nextInt());
        }
 
        for (int i = 1; i < n; ++i) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j+1,list.get(j));
                j = j - 1;
            }
            list.set(j+1,key);
        }
 
        System.out.println("Sorted array elements"+list);
        in.close();
    }
};
