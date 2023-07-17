package loop;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter lines");
         int lines=sc.nextInt();
         for(int i=1;i<=lines;i++){
            for(int j=1;j<=lines;j++){
                System.out.print("*");
            }
            System.out.print("\n");
         } 
        }

    }
    

