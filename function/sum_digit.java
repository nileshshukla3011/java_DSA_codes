package function;

public class sum_digit {
    public static void main(String[] args) {
        System.out.print(sum(309));
    }
    
    public static int sum(int a){
        int sum=0;
        while(a>0){
        int lastdigit=a%10;
         sum=sum+lastdigit;
         a/=10;
    }
    return sum;
    }
    
}
