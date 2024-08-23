package pattern;

public class practice{
    public static void HollowRec(int row, int coulum){
        for(int i=1;i<=row;i++){
            for(int j=1;j<coulum;j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        HollowRec(4,5);
    }
}
