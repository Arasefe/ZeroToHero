package buildingblocks.unaryoperator;

public class UnaryOperator6 {
    public static void unaryMethod(){
        boolean keepGoing=true;
        int result=15, i=10;
        do{
            i--;                            //10,9
            if(i==8) keepGoing=false;       //9,8
            result-=2;                      //13,11

        }while(keepGoing);
        System.out.println(result);

    }

    public static void main(String[] args) {
        unaryMethod();
    }
}
