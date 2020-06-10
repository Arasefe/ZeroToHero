package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.List;

public class DrinkPrices {
    public static void main(String[] args) {
        /*
        If there is a %10 tax, add this tax to all drinks and show them on the same arraylist
         */
        List<String> drinks= Arrays.asList("Coffee $2.20","Cappuccino $4.5", "Latte $3.4", "Hot Chocolate $4.1","Black Tea $3.0");
        for(int i=0;i<drinks.size();i++){
            int indexOf$=drinks.get(i).indexOf('$');                // Accepts both char and String " " or ''
            String priceStr=drinks.get(i).substring(indexOf$+1);
            double price=Double.parseDouble(priceStr);              // parse gives primitive data type, valueOf gives wrapper class
            double newPrice=price*1.1;                              // %10 TAX added 2.42
            String newValue=drinks.get(i).substring(0,indexOf$+1)+newPrice;
            drinks.set(i,newValue);
        }
        System.out.println(drinks);
    }
}
