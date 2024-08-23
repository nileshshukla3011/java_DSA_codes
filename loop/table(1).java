package loop;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int product;
        for(int i=1;i<=10;i++){
          product=number*i;
          System.out.println(  number + "*"+ i + "= " + product);
        }

        
    }
    
}
