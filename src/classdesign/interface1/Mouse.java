package classdesign.interface1;


public interface Mouse {
    public static String COLOR="White";


    public abstract void click();

   default void scroll(){       // default in here is not access modifier and makes this abstract method regular method
       System.out.println("Mouse scrolls  up/down");
   }

}
