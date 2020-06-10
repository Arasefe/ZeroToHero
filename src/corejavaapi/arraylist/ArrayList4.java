package corejavaapi.arraylist;
import java.util.Arrays;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {
        List<String> items= Arrays.asList("2","5","1","9");
        List<String> prices=Arrays.asList("$22.5","$41.2","$8.9","$2.4");
        // get the total expenses
        // 2*22.5+5*41.2+1*8.9+9*2.4=totalExpense
        double totalExpense=0;
        int i=0;
        for (i=0;i<items.size();i++){
            int itemAmount=Integer.parseInt(items.get(i));          // parse gives primitive values. valueOf will get wrapper class
            String price=prices.get(i).substring(1);                // price "22.5"
            double itemPrice=Double.parseDouble(price);             // convert String price to primitive double
            totalExpense+=itemAmount*itemPrice;
        }
        System.out.println("The total expense is " +totalExpense);

    }
}
