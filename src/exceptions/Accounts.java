package exceptions;

public class Accounts {
    public void withdraw(int amount)throws Exception{
        System.out.println("This method is withdrawing money");
    }
    public void deposit (int amount) throws RuntimeException{
        System.out.println("Depositing money");
    }
}
