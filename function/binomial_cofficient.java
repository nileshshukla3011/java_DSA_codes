package function;

public class binomial_cofficient {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<a;i++){
            f*=i;
        }
        return f;
    }    
    public static int binomial_cofficien(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nminusr=fact(n-r);
        int bc=fact_n/ fact_r*fact_nminusr;
        return bc;
    }
    public static void main(String[] args) {
        System.out.println( binomial_cofficien(7,6));
    }
}
