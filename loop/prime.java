package loop;

import java.util.*;

public class prime {
    // prime: 2, 3, 5, 7, 11
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       boolean isPrime = true;

        if (n == 2 || n==1) {
            System.out.println("Prime number");
        } else {

            for (int i = 2; i <= n - 1; i++) {
                
                if (n % i == 0) {
                 isPrime = false;
                } 
            }
            if (isPrime == false){
                System.out.println("Not prime");
            }else{
                System.out.println("prime");
            }

        }

    }

}
