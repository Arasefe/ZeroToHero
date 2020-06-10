package javabuildingblocks.garbagecollection;

public class Bear {
    protected void finalizer(){
        System.out.println("Roar"); //might or might not be called
    }

    public static void main(String[] args) {
        Bear bear=new Bear();
        bear=null;
        System.gc();                //might or might not be called
    }

}
