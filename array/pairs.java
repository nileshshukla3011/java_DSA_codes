package array;
public class pairs {
    public static void reverse(int arr[]){
       for(int i=0;i<arr.length;i++){
        int curr=arr[i] ;
        for( int j=i+1;j<arr.length;j++){
            System.out.print("("+ curr +","+arr[j]+")");
        }
        System.out.println();;
       }

    }
    public static void main(String[] args) {
        int arr[]={5,7,8,9,20};
        reverse(arr);

    }
    
}
