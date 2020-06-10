package furniture;

public class Table extends Furniture {
    int quantity;
    public Table(String name, int price, int quantity){
        super(name, price,quantity);
        //this.quantity=quantity;
    }
    @Override
    public void details(){
        System.out.println("details of Furniture"+name+" "+price+" "+ quantity );
    }
}
