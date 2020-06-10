package javabuildingblocks.object;
public class MobilePhone {
    /*
    1- Brand name of phone
2- Person name
3- User passcode
4- Array for contact list
5- Array for phone numbers
6- isLogin
     */
    String brand;
    String personName;
    String passcode;
    String [] contactList=new String[10];
    String [] phoneNumbers=new String[10];
    boolean isLogin;

    public void displayContact(){                                         //1.st method
        for(int i=0;i<contactList.length;i++){
            System.out.println(contactList[i]+" --> "+phoneNumbers[i]);
        }
    }
    // contactlist{Muammer, null,null,...}// Arslan
    // phoneNumbers{2235672435, null,null...}
    public boolean addNewContact(String name, String phoneNumber){          //2 nd method
        boolean isAdded=false;
        for(int i=0;i<contactList.length;i++){
            if(contactList[i]==null){
                contactList[i]=name;
                phoneNumbers[i]=phoneNumber;
                isAdded=true;
                break;
            }
        }
        return isAdded;
    }
    // Arslan, ArslanTechtorial, ArslanCompany
    public void updateName(String oldName, String newName){                 //3rd method
        for(int i=0;i<contactList.length;i++){
            if(contactList[i].equals(oldName)){
                contactList[i]=newName;
                break;
            }
        }
    }
    public void updatePhone(String oldPhone, String newPhone){              //4th method
        for(int i=0;i<phoneNumbers.length;i++){
            if(phoneNumbers[i].equals(oldPhone)){
                phoneNumbers[i]=newPhone;
                break;
            }
        }
    }
    public boolean removeContact(String name){                              //5th method
        for(int i=0;i<contactList.length;i++){
            if (contactList[i]==null){
                continue;
            }
            if(contactList[i].equals(name)){

                contactList[i]=null;
                phoneNumbers[i]=null;
                return true;
            }
        }
        return false;
    }
    public String searchPhone(String phoneNumber){                          //6th method
        for(int i=0;i<phoneNumbers.length;i++){
            if(phoneNumbers[i].equals(phoneNumber)){
                return contactList[i];
            }
        }
        return null;
    }
    public String searchName(String name){                                  //7th method
        for(int i=0;i<contactList.length;i++){
            if(contactList[i].equals(name)){
                return phoneNumbers[i];
            }
        }
        return null;
    }
    public boolean login(String passcode){                                  //8th method
        if(this.passcode.equals(passcode)){
            System.out.println("Welcome "+brand+"!");
            isLogin=true;
            return isLogin;
        }
        return isLogin;
    }
    public void getInstructions(){                                           // 9th method
        System.out.println("To be able to login press 1");
        System.out.println("To be able to Print list of Contact press 2");
        System.out.println("To be able to add new contact press 3");
        System.out.println("To be able to update contact name press 4");
        System.out.println("To be able to update phone number press 5");
        System.out.println("To be able to remove contact press 6");
        System.out.println("To be able to search with phone number press 7");
        System.out.println("To be able to search with name press 8");
        System.out.println("To Exit press 9");
    }
}
