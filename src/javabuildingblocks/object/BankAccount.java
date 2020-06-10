package javabuildingblocks.object;

public class BankAccount {
    //personName, bankName, accountNumber, balance,
    // accountOpenDate, username, password
    /*
    1- Create one method to display bank information
    2- Create one method will take one parameter as a deposit amount and it will update the balance, and return balance
    3- Create one method will take one parameter as a withdraw amount and it will update the balance and return balance
     */
    String personName;
    String bankName;
    int accountNumber;
    double balance;
    String accountOpenDate;
    String username;
    String password;
    boolean islogin=false;
    public void displayInfo(){
        if(islogin) {
            System.out.println("The person name is " + personName);
            System.out.println("Bank name is " + bankName);
            System.out.println("Account number is " + accountNumber);
            System.out.println("The balance is " + balance);
            System.out.println("Open date is " + accountOpenDate);
            System.out.println("Username and password " + username + " " + password);
        }else{
            System.out.println("Please first login to the account");
        }
    }
    public double deposit(double amount){
        if(islogin) {
            balance += amount;
        }else{
            System.out.println("Please first login");
        }
        return balance;
    }
    public double withdraw(double amount){
        if (islogin) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("You can not withdraw the money");
            }
        }else{
            System.out.println("Please first login");
        }
        return balance;
    }
    public boolean login(String uname, String pword){
        if(username.equals(uname) && password.equals(pword)){
            System.out.println("Welcome to the "+bankName+" account");
            System.out.println("You have successfully signed to the your account");
            displayInfo();
            islogin=true;
            return islogin;
        }else{
            System.out.println("Your username or password is incorrect. Please try later.");
        }
        return islogin;
    }
    public void signUp(String personName, int accountNumber, double balance, String username, String password, String accountOpenDate ){
        this.personName=personName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.username=username;
        this.password=password;
    }
    public void getInstruction(){
        System.out.println("To Display the info press 0");
        System.out.println("To Deposit the money press 1");
        System.out.println("To Withdraw the money press 2");
        System.out.println("To signUp press 3");
        System.out.println("To login press 4");
        System.out.println("To exit the application press 5");
    }
    /*
    displayInfo-0
    Deposit-1
    withdraw-2
    Signup-3
    Login-4
    Exit-5
    Create one method to be able to display the our functionality
     */
}
