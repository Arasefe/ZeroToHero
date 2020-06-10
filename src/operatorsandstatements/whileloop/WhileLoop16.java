package operatorsandstatements.whileloop;

import java.util.Arrays;

public class WhileLoop16 {
    static String [] prices={"$25","$66","$5","$89","$21"};
    // Convert this array of String to Array of int without $ sign.

   public static  int [] priceConverter(String [] prices){
        int [] result=new int[prices.length];               // created new array of int to store
        for (int i=0;i <prices.length;i++){
            prices[i]=prices[i].substring(1);
            result[i]=Integer.valueOf(prices[i]);           // Integer-->int-->Unboxing
        }
       return result;
    }

    public static void main(String[] args) {
       String result=Arrays.toString(priceConverter(prices));
        System.out.println(result);
    }
}
