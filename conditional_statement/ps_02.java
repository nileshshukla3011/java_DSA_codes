package conditional_statement;

import java.util.Scanner;

public class ps_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your body temperature");
        double temp = sc.nextDouble();

        if( temp >100 ){
            System.out.println(" You have a fever ");
        }
        else{
            System.out.println(" You dont have a fever");
        }

    }
}
