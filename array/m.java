package array;

public class m {
    public static void main(String[] args) {
        int n = 893;
        int x=0;
        while(n>0){
            int z=n%10;
            x=(x*10)+z;
            n=n/10;
        }
        System.out.println(x);
    }
    
}
