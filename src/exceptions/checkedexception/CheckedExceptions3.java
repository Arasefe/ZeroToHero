package exceptions.checkedexception;

public class CheckedExceptions3 {
    public String name;
    public void parseName(){
        System.out.println("1");
        try{
            System.out.println("2");
            int x=Integer.parseInt(name);
        }catch (NumberFormatException e){
            System.out.println("4");
        }
    }

    public static void main(String[] args) {
        CheckedExceptions3 leroy=new CheckedExceptions3();
        leroy.name="Leroy";
        leroy.parseName();
        System.out.println("5");
    }
}
