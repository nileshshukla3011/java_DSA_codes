package sorting;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort{
    public static void printarr(Integer arr[]){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
    public static void main(String[] args) {
        Integer arr[]={4,7,4,3,8,2,9};
        Arrays.sort(arr,1,4,Collections.reverseOrder());
       // System.out.println(arr);
       printarr(arr);
       
    }
}
