package furniture;

public class Sofa extends Furniture {
    int quantity;
    public Sofa(String name,int price, int quantity){
        super(name,price,quantity);
    }
    @Override
    public void details(){
        System.out.println("Name is" +name+"\n price is:"+ price+ "\n and quantity is : "+ quantity);
    }
}
