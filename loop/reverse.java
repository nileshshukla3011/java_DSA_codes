package loop;

import java.util.Scanner;

//print reverse of number
public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n /= 10;
        }
    }

}
