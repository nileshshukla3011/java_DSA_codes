package pattern;

public class NumPyramid {

    
    public static void numPy(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numPy(5);
    }
}
