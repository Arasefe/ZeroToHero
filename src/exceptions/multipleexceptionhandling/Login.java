package exceptions.multipleexceptionhandling;

import java.util.Scanner;

public class Login {
    public static final String USERNAME;
    public static final String PASSWORD;

    static{
        USERNAME="aras efe";
        PASSWORD="12345";
    }

    public static void myMethod() throws Exception{
        Scanner input=new Scanner (System.in);
        System.out.println("Please enter your USERNAME");
        String inputUsername=input.next();
        System.out.println("Please enter your Password");
        String inputPassword=input.next();
        Login login=new Login();
        if(!inputUsername.equalsIgnoreCase(login.USERNAME)){
            throw new Exception("Username is not matched with your password"+ inputPassword);
        }
        if(!inputPassword.equals(login.PASSWORD)){
            throw new Exception ("Password is not matched with your " + inputUsername);
        }
        System.out.println("Welcome to the application");
    }

    public static void main(String[] args) {
        try{
            System.out.println("1");
            myMethod();
            System.out.println("2");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("3");
        }catch (Throwable t){
            System.out.println();
            System.out.println("4");
        }finally {
            System.out.println("5");
            System.out.println("In finally Block");
        }
        System.out.println("6");
    }
}
