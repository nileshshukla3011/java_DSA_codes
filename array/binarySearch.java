package array;

public class binarySearch {
    public static int search(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid +1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int key = 8;
        System.out.println(search(number, key));

    }

}
