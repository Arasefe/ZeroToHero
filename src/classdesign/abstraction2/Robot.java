package classdesign.abstraction2;

public class  Robot extends Machine {
    public boolean turnOn(){
        return false;
    }
    public static void main(String[] args) {
        Machine m=new Robot();

    }

}
