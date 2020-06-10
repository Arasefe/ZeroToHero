package classdesign.interface3;

public interface MemoryCard {
    int SIZE=128;
    String NAME="Sony";

    Object storeFiles();

    default void regularMethod(){
        System.out.println("This method is from MemoryCard interface");
    }
    static void staticMethod(){
        System.out.println("This static method is from MemoryCard interface");
    }
}
