package furniture;

public class Drawer extends Furniture {
    //int quantity;
    public Drawer(String name, int price, int quantity){
        super(name, price,quantity);

    }
    @Override
    public void details(){
        System.out.println("Furniture name: " + name+"\nPrice: " +price+"\nQuantity:" + quantity);
    }

    public static void main(String[] args) {
//        Furniture furniture1=new Furniture("Furniture",100);
//        Furniture furniture2=new Table("White Table",50,2);
//        Furniture furniture3=new Drawer("Small Drawer",100,1);
//        Furniture furniture4=new Sofa("Grey Sofa",150,5);
//        furniture2.details();
//        furniture2=new Sofa("White Sofa", 50,8);

        Furniture[] furnitures=new Furniture[3];
        furnitures[0]=new Table("White Table", 50,2);
        furnitures[1]=new Drawer("Small Drawer", 100,1);
        furnitures[2]=new Sofa("Grey Sofa",150,5);

        int sum=0;
        for (Furniture furniture:furnitures){
            furniture.details();
            sum+=furniture.price*furniture.quantity;
        }
        System.out.println(sum);
    }
}
