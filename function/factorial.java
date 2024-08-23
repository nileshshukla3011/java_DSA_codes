package function;

public class factorial {
    public static int fact (int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;

        }
        return f;
        }
        public static int binomialCofficient(int n,int r){
           int fac_n= fact(n);
           int fac_r=fact(r);
           int fac_nmr=fact(n-r);
           int bc= fac_n/(fac_r * fac_nmr);

           return bc;

        }
        public static void main(String[] args) {

           
           System.out.println(binomialCofficient(5, 2));
        }
}
