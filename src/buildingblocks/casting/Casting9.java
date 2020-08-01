package buildingblocks.casting;

public class Casting9 {
  static  int a=3;            //'e'
    byte b=2;           //b
    short s=5;          //s
    int i='e';          //'e'
    char c=3;           //3
    public Casting9() {
        this.a=this.i;
        System.out.println("This is the i "+a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println("This is char c"+c);

    }
    public static void main(String[] args) {
        Casting9 c=new Casting9();
            System.out.println(new Casting9());

    }
}
