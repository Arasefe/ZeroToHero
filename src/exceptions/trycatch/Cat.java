package exceptions.trycatch;

public class Cat {
    public String name;
    public void parseName(){
        System.out.println("1");
        try{
            System.out.println("2");
            int x=Integer.parseInt(name);
        }catch(NullPointerException e){
            System.out.println("4");
        }
        System.out.println("5");
        }
    public static void main(String[] args) {
        Cat leo=new Cat();
        leo.name="Leo";
        leo.parseName();
        System.out.println("6");
    }
}
