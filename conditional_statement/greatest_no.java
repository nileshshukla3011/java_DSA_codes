package conditional_statement;

public class greatest_no {
    public static void main(String[] args) {
    int a=5;
    int b=6;
    int c=8;
      
    if( a>=b && a>=c){
        System.out.print(a);
    }
    else if( b >=c && b>=a)
    {System.out.print(b);}
    else {
        System.out.print(c);
    }
    }
    
}
