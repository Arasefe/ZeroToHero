package javabuildingblocks.garbagecollection;

public class Coffee {

    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        Coffee coffee1=new Coffee();
        coffee=coffee1;
        System.gc();                    //

    }
}
