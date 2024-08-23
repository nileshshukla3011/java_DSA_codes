package function;

public class btod {

    public static void binaryTodecimal(int binaryNum) {
        int num = binaryNum;
        int number=0;
        int pow = 0;
        while (binaryNum > 0) {
            int ld = binaryNum % 10;
          number = number+((int) Math.pow(2, pow) * ld);
          pow++;
          binaryNum = binaryNum / 10;

        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        // System.out.println( java.lang.Math.pow ( 2,4)) ;
        binaryTodecimal(11011);
    }

}
