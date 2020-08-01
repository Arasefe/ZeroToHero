package javabuildingblocks.object;
import java.util.Scanner;
public class RealBank {
    public static void main(String[] args) {
        System.out.println("This is Chase Bank Application");
        System.out.println("What is your name?");
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Chase Bank "+input.next()+"!");
        int exit=0;
        BankAccount account=new BankAccount();
        do{
            account.getInstruction();
            System.out.println("Please enter your choose");
            int myOption=input.nextInt();
            switch (myOption){
                case 0:
                    account.displayInfo();
                    break;
                case 1:
                    System.out.println("Please enter deposit amount");
                    int depositAmount=input.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Please enter withdraw amount");
                    int withdrawAmount=input.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Please enter your name");
                    String personName=input.next();
                    System.out.println("Please enter account number");
                    int accountNumber=input.nextInt();
                    System.out.println("Please enter your balance");
                    double balance=input.nextInt();
                    System.out.println("Please enter username");
                    String username=input.next();
                    System.out.println("Please enter password");
                    String password=input.next();
                    System.out.println("Please enter date");
                    String date=input.next();
                    account.signUp(personName,accountNumber,balance,username,password,date);
                    break;
                case 4:
                    System.out.println("Please enter username");
                    String uname=input.next();
                    System.out.println("Please enter password");
                    String pass=input.next();
                    account.login(uname,pass);
                    break;
                case 5:
                    exit=5;
                    break;
            }
        }while (exit!=5);
        System.out.println("Thank you for working with our bank");

        //TASK: implement cases for other functionalities
    }
}