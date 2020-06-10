package methodsandencapsulation.constructors;

public class Amazon {
    public static void navigate(String url){
        System.out.println("Navigating to "+url);
    }
    public static void login(String username, String password){
        System.out.println("Logging into amazon with username: "+username+"and password: "+ password);
    }
    public static void search (String itemName){
        System.out.println("Searching for the "+ itemName);
    }
}
