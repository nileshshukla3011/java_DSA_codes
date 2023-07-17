package loop;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int product = 1;
        for (int i = 1; i <= num; num--) {
            product = i * num;
        }
        System.out.println("Factorial: " + product);
        /*
         * do{
         * product =product *num;
         * num--;
         * }while(num!=0);
         */
        // System.out.println(product);
    }
}
