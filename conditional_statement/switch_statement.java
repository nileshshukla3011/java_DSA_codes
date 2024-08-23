package conditional_statement;

public class switch_statement {
    public static void main(String[] args) {
        int number = 2;
        /*
         * switch(variable){
         * case 1:
         * break;
         * case 2:
         * break;
         * case 3:
         * break;
         * dafault:
         * }
         */

        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("we are dreaming");

        }
    }
}
