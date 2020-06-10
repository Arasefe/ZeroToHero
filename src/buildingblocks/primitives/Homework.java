package buildingblocks.primitives;

public class Homework {
    public static void main(String[] args) {
        char letter1='I';
        char letter2='S';
        char letter3='M';
        char letter4='A';
        char letter5='I';
        char letter6='L';
        String result="";
        for (int i=0;i<5;i++){
            result+=letter1;
            result+=letter2;
            result+=letter3;
            result+=letter4;
            result+=letter5;
            result+=letter6;
            System.out.println(result);
        }
        System.out.println("letter1"+"letter2"+"letter3"+"letter4"+"letter5"+"letter6");
        System.out.println(""+letter1+letter2+letter3+letter4+letter5+letter6);



        System.out.println();
    }
}
