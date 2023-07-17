import java.util.*;
public class ps_03 {
    public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
        float eraser = sc.nextFloat();
        float pen = sc.nextFloat();
        float pencil= sc.nextFloat();
        float c= (eraser + pen + pencil)*18/100;
        float d=eraser + pen + pencil + c;
        System.out.println("bill is:" +d  );

    }
    
}
