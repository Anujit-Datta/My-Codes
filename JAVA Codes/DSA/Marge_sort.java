import java.util.*;
public class Marge_sort {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter array size: ");
    int n=in.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter Array elements: ");
    for(int i=0; i<n; i++){
        arr[i]=in.nextInt();
    }
    split(arr);
    System.out.print("Sorted array elements: ");
    for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
    in.close();
  }

  public static void split(int arr[]){
    int N=arr.length;
    if(N<2){return;}
    int mid=N/2;
    int left[]=new int[mid], right[]=new int[N-mid];
    for(int i=0; i<mid; i++){
        left[i]=arr[i];
    }for(int i=mid; i<N; i++){
        right[i-mid]=arr[i];}
    split(left);
    split(right);
    marge(arr,left,right);
  }

  public static void marge(int arr[],int left[], int right[]){
    int lN=left.length, rN=right.length,  i=0, j=0, k=0;
    while(i<lN && j<rN){
        if(left[i]<=right[j]){
            arr[k]=left[i]; i++;
        }else{
            arr[k]=right[j]; j++;
        } k++;
    }
    while(i<lN){arr[k]=left[i]; i++; k++;}
    while(j<rN){arr[k]=right[j]; j++; k++;}
  }
}
