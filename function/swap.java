package function;

public class swap {
    public static void swapNum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " +  a);
        System.out.println("b is " +  b);
        return;
    }

    public static void main(String[] args) {
              swapNum(40, 070);
    }
}
