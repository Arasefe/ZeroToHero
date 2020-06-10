package buildingblocks.unaryoperator;

public class UnaryOperator4 {
    public static void unaryOperator(){
        int x=1,y=15;
        while(x<10){
            y--;
            x++;
            System.out.println(x+","+y);
        }

    }

    public static void main(String[] args) {
        unaryOperator();
    }
}
