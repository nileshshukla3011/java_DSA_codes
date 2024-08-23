package practice;

public class p4 {
    public static int pivotIndex(int prices[]) {
        for (int pi = 0; pi < prices.length; pi++) {
            int ls = 0, rs = 0;
            // pi=i;
            for (int j = 0; j < pi; j++) {
                ls += prices[j];
            }

            for (int k = pi + 1; k < prices.length; k++) {
                rs += prices[k];
            }
            if (ls == rs) {
                return pi;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int prices[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(prices));
    }
}
