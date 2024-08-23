package array;

public class largestArray {

    public static int lar(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
           
        }
        return largest;
    }
    public static void main(String[]args){
        int numbers[]={6,7,8,8,6,5,0};
        int largestNum=lar(numbers);

        System.err.println("largest number in array is:"+ largestNum);
    }
    
}
