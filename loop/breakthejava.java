// keep entering number until user enter 10
package loop;
 import java.util.*;
public class breakthejava{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         
        do{
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
                System.out.println("you entered multiple of 10");
            }
            System.out.print(n);
        }while(true);
    }
    
}
