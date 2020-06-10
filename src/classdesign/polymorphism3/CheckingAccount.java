package classdesign.polymorphism3;

public class CheckingAccount extends BankAccounts {

    public CheckingAccount(String name, int balance){
        super(name,balance);
    }
    public static void printBankDetails(BankAccounts bankAccounts){
        bankAccounts.printDetails();    }
    public static void printBankDetails(CreditAccount creditCard){

        }

}
