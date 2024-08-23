package D_ARRAY;

import java.util.*;

public class matrices {
    public static boolean search(int matrices[][], int key){
              
        for (int i = 0; i <matrices.length ; i++) {
            for (int j = 0; j < matrices.length; j++) {
                if(key==matrices[i][j]){
                    System.out.println("found cell at"+ i +"," +j );
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrices[][] = new int[3][3];
        int n = matrices.length;
        int m = matrices.length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrices[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrices[i][j]);
            }
            System.out.println();
        }
        search(matrices, 5);  

    }
}
