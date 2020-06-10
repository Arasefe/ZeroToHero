package classdesign.polymorphism3;

public class CreditAccount extends BankAccounts {

    public CreditAccount(String name, int balance) {
        super(name, balance);
    }
    public static void printBankDetails(BankAccounts bankAccounts){
        bankAccounts.printDetails();
        System.out.println("First Method");
    }
    public static void printBankDetails(CreditAccount creditaccount){
        creditaccount.printDetails();
        System.out.println("Second Method");
    }

    public static void main(String[] args) {
        BankAccounts b1=new CreditAccount(" VISA", 1000);
        BankAccounts b2=new BankAccounts(" MasterCard",500);
        CreditAccount c1=new CreditAccount(" VISA",800);
        CheckingAccount ca1=new CheckingAccount(" Discovery", 500);


        printBankDetails(b1);
        printBankDetails(b2);
        printBankDetails(c1);
        printBankDetails(ca1);
    }
}

