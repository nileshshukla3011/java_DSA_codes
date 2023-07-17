package conditional_statement;

import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS:");
        int number=sc.nextInt();
        /*if(number>=33){
            System.out.println("pass");
        } else{
            System.out.println("fail");
        }*/
        String type=(number>=33)? "pass" : "fail";
        System.out.println(type);
    }
    
}
