/*package practice;
import java.util.*;

public class p3 {
    public static int stock(int prices[]){
        int maxi=Integer.MIN_VALUE;
        int profit=0;

    for(int i=0;i<prices.length;i++){
        for(int j=i+1;j<prices.length;j++){
           profit=prices[j]-prices[i];
             maxi=Math.max(maxi, profit);
        }

    }
    return maxi;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
       System.out.println(stock(prices));
    }
    
}*/
package practice;
import java.util.*;

public class p3 {
    public static int stock(int prices[]){
        int maxi=Integer.MIN_VALUE;
        int profit=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                profit=prices[j]-prices[i];
                maxi=Math.max(maxi, profit);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stock(prices));
    }
}

