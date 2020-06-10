package buildingblocks.unaryoperator;

public class UnaryOperator5 {
    public static void unaryOperator(){
        int y=0;
        do{
            y=1;
            System.out.println(y++ +"");

        }while (y<=10);
    }

    public static void main(String[] args) {
        unaryOperator();
    }
}
