package javabuildingblocks.object;

public class BankAccountTest {
    public static void main(String[] args) {
    BankAccount account=new BankAccount();

    account.personName="Ismail";
    account.bankName="Chase";
    account.accountNumber=123456;
    account.accountOpenDate="5/12/2019";
    account.username="Techtorial";
    account.password="Tech2200";

    account.displayInfo();
    account.deposit(1000);

    account.withdraw(350);
    account.withdraw(750);      // The deposit is less than the withdraw money so you can not withdraw that amount of money.
        System.out.println("The balance is"+account.balance);
}
}
