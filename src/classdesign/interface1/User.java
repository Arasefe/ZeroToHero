package classdesign.interface1;

public class User extends Computer {


    @Override
    public boolean isOnSell() {
        return false;
    }

    @Override
    public void type() {
        System.out.println("Keyboard is typing");
    }

    @Override
    public int batteryLife() {
        return 0;
    }

    @Override
    public void click() {

    }

    @Override
    public void display() {
        System.out.println("Display resolution of the screen");

    }

    public static void main(String[] args) {
        User user=new User();
        System.out.println(user.batteryLife());
        System.out.println(user.MEMORY);
    }
}
