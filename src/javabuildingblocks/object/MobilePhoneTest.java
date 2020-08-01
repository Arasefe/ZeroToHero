package javabuildingblocks.object;
import java.util.Scanner;
public class MobilePhoneTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MobilePhone mobile=new MobilePhone();
        System.out.println("Welcome to our Contact List Application");
        System.out.println("Please enter your name");
        String name=input.next();
        mobile.personName=name;
        System.out.println("Please enter your passCode");
        String passcode=input.next();
        mobile.passCode=passcode;
        int exit=0;
        do{
            mobile.getInstructions();
            System.out.println("Please enter your choose");
            int myOption=input.nextInt();
            switch (myOption){
                case 1:
                    System.out.println("Please enter your passCode");
                    String code=input.next();
                    mobile.login(code);
                    break;
                case 2:
                    mobile.displayContact();
                    break;
                case 3:
                    System.out.println("Please enter name");
                    String name1=input.next();
                    System.out.println("please enter phone number");
                    String phoneNumber=input.next();
                    mobile.addNewContact(name1,phoneNumber);
                    break;
                case 4:
                    System.out.println("Please enter old name");
                    String oldName=input.next();
                    System.out.println("Please enter new name");
                    String newName=input.next();
                    mobile.updateName(oldName,newName);
                    break;
                case 5:
                    System.out.println("Please enter old phone number");
                    String oldPhone=input.next();
                    System.out.println("Please enter new phone number");
                    String newPhone=input.next();
                    mobile.updatePhone(oldPhone,newPhone);
                    break;
                case 6:
                    System.out.println("Please enter the name to remove from contact list");
                    String removedName=input.next();
                    mobile.removeContact(removedName);
                    break;
                case 7:
                    System.out.println("Please enter phone number");
                    String phone=input.next();
                    System.out.println(mobile.searchPhone(phone));
                    break;
                case 8:
                    System.out.println("Please enter name to search phone");
                    String searchName=input.next();
                    System.out.println(mobile.searchName(searchName));
                    break;
                case 9:
                    exit=9;
                    break;
            }
        }while(exit!=9);
        System.out.println("Thank you for using the Phone");
    }
}


