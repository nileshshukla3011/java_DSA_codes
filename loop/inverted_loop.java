package loop;

public class inverted_loop {
    public static void main(String[] args) {
        int n=4;
        for (int lines=1 ; lines<=4;lines++){
            for(int star=1;star<=n-lines+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
