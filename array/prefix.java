package array;
public class prefix {
    public static void maxArray(int number[]){
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        int pref[]=new int[number.length];
        pref[0]=number[0];
        for(int i=1;i<number.length;i++){
            pref[i]=pref[i-1]+number[i];

        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=0;j<number.length;j++){
                int end=j;
                curr =start==0?pref[end]:pref[end]-pref[start-1] ;
                if(curr>maxSum){
                    maxSum=curr;
                }

            }
        }
        System.out.println("max sum:"+ maxSum);
       
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxArray( number);


    }
}
