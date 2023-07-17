package array;

public class max_sub_sum {
        public static void maxSubArray(int arr[]){
            int curr=0;
            int maxsum=Integer.MIN_VALUE;
            for (int i=0;i<arr.length;i++){
                int start=i;
                for(int j=0;j<arr.length;j++){
                    int end=j;
                    curr=0;
                    for(int k=start;k<=end;k++){
                        curr += arr[k];

                        if(curr>maxsum){
                            maxsum=curr;
                        }
                    }
                }
            }
            System.out.println("Max sum:" + maxsum);
        }
    public static void main(String[] args) {
        int arr[]={9,7,8,5,6,1,4};
        maxSubArray(arr);
    }
}
