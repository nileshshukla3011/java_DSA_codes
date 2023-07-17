package loop;

public class reverse_given {
    public static void main(String[]args){
        int n=10897;
        int rev=0
        for (;rev>0;rev++){
            int lastdigit=n%10;
            rev= (rev*10)+ lastdigit;
            n/=10;
        }
        System.out.print(rev);

    }
    
}
