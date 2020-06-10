package classdesign.polymorphism3;

public class BankAccounts {
    String name;
    int balance;

    public BankAccounts(String name, int balance){
        this.name=name;
        this.balance=balance;
    }
    public void printDetails (){
        System.out.println("Name"+ name+"\nBalance : "+balance);
    }
}
