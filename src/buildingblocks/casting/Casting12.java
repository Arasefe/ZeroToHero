package buildingblocks.casting;

public class Casting12 {
  static  int a=3;            //'e'
    byte b=2;           //b
    short s=5;          //s
    int i='e';          //'e'
    char c=3;           //3
    public Casting12() {
        this.a=this.i;
        System.out.println("This is the i "+a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println("This is char c"+c);

    }
    public static void main(String[] args) {
        Casting12 c=new Casting12();
            System.out.println(new Casting12());

    }
}
