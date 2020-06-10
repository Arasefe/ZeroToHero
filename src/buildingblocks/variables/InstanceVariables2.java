package buildingblocks.variables;

public class InstanceVariables2 {
    static final int BAG_WEIGHT=12;
    int bagHeight;
    byte bagSize;
    public void bagMethod(){
        bagHeight=4;
        bagSize=8;
    }

    public static void main(String[] args) {
        InstanceVariables2 vr=new InstanceVariables2();
        System.out.println(vr.bagHeight);
        System.out.println(vr.bagSize);
        System.out.println(BAG_WEIGHT);

    }
}
