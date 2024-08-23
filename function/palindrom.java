package function;

import java.util.*;

public class palindrom {

    public static void rev(int a) {
        int n = a;
        int num = 0;
        while (a > 0) {
            int lastdigit = a % 10;
            num = (num * 10) + lastdigit;
            a = a / 10;

        }
        //System.out.println(num);
        if (n == num) {

            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        rev(a);
    }

}
