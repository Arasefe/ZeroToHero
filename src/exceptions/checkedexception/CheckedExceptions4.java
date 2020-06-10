package exceptions.checkedexception;

public class CheckedExceptions4 {
    public String name;
    public void run(){
        System.out.println("1");

        try{
            System.out.println("2");
            name.toString();
            System.out.println("3");
    }catch (NullPointerException e){
            System.out.println("4");
            throw e;
        }
        System.out.println("5");
    }

    public static void main(String[] args) {
        CheckedExceptions4 jerry=new CheckedExceptions4();
        jerry.run();
        System.out.println("6");
    }
}
