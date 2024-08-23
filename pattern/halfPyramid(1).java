package pattern;

public class halfPyramid {
public static void pattern(int row, int coulum){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=row-i;j++){
            System.out.print(" ");
        }for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    
    pattern(7,7);
}

    
}
