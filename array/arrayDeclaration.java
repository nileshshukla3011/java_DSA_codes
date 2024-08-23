package array;
import java.util.*; 

public class arrayDeclaration {

    public static void main(String[] args) {
         int marks[]= new int[100];

         Scanner csk = new Scanner (System.in);
         marks[0]=csk.nextInt();//phy
         marks[1]=csk.nextInt();
         marks[2]=csk.nextInt();
         
          System.out.println(marks.length);
         System.out.println("phy :" + marks[0]);
         System.out.println("maths :" + marks[1]);
         System.out.println("chem:" + marks[2]);
         int percentage=(marks[0]+marks[1]+marks[2])/3;
         System.out.println("percentage:"+ percentage +"%");
        }     
    
}
 