package javabuildingblocks.garbagecollection;

public class Finalize {

    public static void main(String[] args) {
        Phone phone1=new Phone("IPhone");
        Phone phone2=new Phone("Samsung");
        phone1=phone2;
        phone2=null;
        phone1=null;
        System.gc();
    }
}

