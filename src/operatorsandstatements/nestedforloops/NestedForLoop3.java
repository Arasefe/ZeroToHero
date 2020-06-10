package operatorsandstatements.nestedforloops;

public class NestedForLoop3 {
    public static void nestedForMethod(){
        int x=20;
        while (x>0){
            do{
                x-=2;
            }while(x>5);
            x--;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        nestedForMethod();
    }
}
