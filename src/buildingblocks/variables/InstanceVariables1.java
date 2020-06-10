package buildingblocks.variables;

public class InstanceVariables1 {
    int count;              //instance variable and default value is 0
    public void Salmon(){
        count=4;
    }

    public static void main(String[] args) {
        InstanceVariables1 vr=new InstanceVariables1();
        System.out.println(vr.count);
    }
}
