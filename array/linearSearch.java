package array;

public class linearSearch {
    public static int linear(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 12, 34, 55, 67, 78, 86, 43, 77 };
        int key = 20;
        int index = linear(number, key);
        if (index == -1) {
            System.out.println("Maa chuda key not found");
        } else {
            System.out.println("key index at " + index);
        }

    }

}
