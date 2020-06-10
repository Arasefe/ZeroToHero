package furniture;

public class Furniture {
    String name;
    int price;
    int quantity;
    public Furniture(String name, int price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public void details(){
        System.out.println("Furniture name: "+ name+"\nFurniture price :"+ price);
    }
}
