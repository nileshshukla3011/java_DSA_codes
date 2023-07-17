package loop;

import java.util.*;

public class practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            
            System.out.println("enter the number");
            int number = sc.nextInt();
            if ( number%2==0) {
                evenSum+=number;
            } else {
                oddSum+=number;
                
            }
            System.out.println("want to cntinue press 1 else press 0");
              choice=sc.nextInt();
        }while( choice==1);
            System.out.println("sum of even is" + evenSum);
            System.out.println("sum of odd is "+ oddSum);

        
        

    }

}
