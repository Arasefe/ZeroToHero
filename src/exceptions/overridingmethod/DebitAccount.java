package exceptions.overridingmethod;

import exceptions.Accounts;
import exceptions.creatingownexception.InsufficientBalanceException;

public class DebitAccount extends Accounts {
    int balance;
    @Override
    public void withdraw (int amount)throws Error {
        if (balance < amount) {
            throw new InsufficientBalanceException("Your balance " + balance+ "is less than transaction amount");

        } else if (balance >= amount) {
            balance -= amount;
        }
    }
    @Override
    public void deposit(int amount) throws ArithmeticException{
          balance+=amount;
        }
        public static void main(String[]args){
        DebitAccount debitAccount=new DebitAccount();
        debitAccount.balance=100;
        debitAccount.deposit(50);
        debitAccount.withdraw(100);
        debitAccount.withdraw(55);
        }
   }

