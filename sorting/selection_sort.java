package sorting;

public class selection_sort {
    public static void sort(int num[]) {
      for(int i=0;i<num.length-1;i++){
        int minPos=i;
        for(int j=i+1;j<num.length;j++){
            if(num[minPos]>num[j]){
                minPos=j;
            }
        }
        int temp=num[minPos];
        num[minPos]=num[i];
        num[i]=temp;

      }
        
    }
    public static void printarr(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={2,5,4,6,1,1};
        sort(num) ;
        printarr(num);
        int a=1;
        int b=1;
        if(a>b){
            System.out.println("yes");
        }

    }
    
}
