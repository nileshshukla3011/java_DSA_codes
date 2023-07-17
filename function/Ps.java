package function;

public class Ps {
    public static double avg (double a,double b,double c){
       
         return (a+b+c)/3;
    }    

    public static boolean isEven(int a){
        boolean isEven=false;
        if(a%2==0){
            isEven=true;
        }
        return isEven;


    }
    public static void main(String[] args) {
       System.out.println(isEven(10));
    }


}
