package conditional_statement;

import java.util.*;

public class ps_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println(" Entered number is negative");
        } else {
            System.out.println(" Entered number is positive");

        }
    }

}
