package conditional_statement;

import java.util.Scanner;

public class ps_04 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
         if( year%4==0){
            System.out.println("leap year");
            
         }
         else{
            System.out.println("Not leap year");
         }
    }
}
