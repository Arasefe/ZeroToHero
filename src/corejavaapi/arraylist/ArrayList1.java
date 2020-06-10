package corejavaapi.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void method() {
        ArrayList bankCards = new ArrayList();      // Java 5 1st way
        bankCards.add("Visa");
        System.out.println(bankCards.get(0));       // Visa
        System.out.println(bankCards.size());       // 1
        bankCards.add("MasterCard");                // Visa, MasterCard
        bankCards.add("Amex");                      // Visa, MasterCard,Amex
        bankCards.add("Chase");                     // Visa,MasterCard,Amex, Chase
        System.out.println(bankCards.get(3));       // Chase
        bankCards.add(3, "Discovery");// Visa, MasterCard,Amex,Discovery, Chase(Add Discovery to index number3)
        System.out.println(bankCards);
        bankCards.set(3, "BOF");                    // Visa, MasterCard,Amex,BOF, Discovery, Chase (Set BOF to index number 3)

        bankCards.add(100);                         //
        bankCards.add(true);
        System.out.println(bankCards);

        System.out.println("==================================");

        for (int i = 0; i < bankCards.size(); i++) {
            System.out.println(bankCards.get(i));
        }
    }
    public static void method1(){
        ArrayList<Object>bankCards=new ArrayList<Object>();
        bankCards.add("Visa");
        bankCards.add("MasterCard");                // Visa, MasterCard
        bankCards.add("Amex");                      // Visa, MasterCard,Amex
        bankCards.add("Chase");                     // Visa,MasterCard,Amex, Chase
        bankCards.add(3, "Discovery");// Visa, MasterCard,Amex,Discovery, Chase(Add Discovery to index number3)

        bankCards.add(Boolean.TRUE);                // Adds true;
        for (Object card:bankCards){
            System.out.println(card+"");
            System.out.println();

        }

    }

    public static void main(String[] args) {
        method();
        method1();
    }
}
