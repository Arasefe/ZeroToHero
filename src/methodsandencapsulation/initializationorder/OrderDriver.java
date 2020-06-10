package methodsandencapsulation.initializationorder;

public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result+"");  //u
        System.out.print(Order.result+"");  //u
        new Order();                        //ucr
        new Order();                        //cr

        System.out.print(Order.result+"");

    }
}
