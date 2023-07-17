package sorting;

public class bubble_sort {
    public static void sorting(int num[]) {
        for (int turns = 0; turns < num.length - 1; turns++) {
             for(int j=0;j<(num.length-1)-turns;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
             }
        }
    }
    public static void printarr(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = { 5, 1, 4, 2, 3, 6 };
        //sorting(num);
        printarr(num);
    }

}
