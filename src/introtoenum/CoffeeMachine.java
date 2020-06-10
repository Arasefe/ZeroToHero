package introtoenum;
enum Sizes{
    TALL, VENTI,GRANDE
}
class Screen{
    int number=1;
    public void printInfo(){
        System.out.println("Information is displaying");
    }
public static class Data {
        public void informationDisplay(){
            System.out.println("Info is displaying");
        }
    }
}
public class CoffeeMachine {
    public static void main(String[] args) {
        //You can not use the new keyword for enum
        CoffeeSizes sizes=CoffeeSizes.GRANDE;
        switch (sizes){
            case TALL:
                System.out.println("The size is tall");
                break;
            case VENTI:
                System.out.println("The size is mid");
                break;
            case GRANDE:
                System.out.println("The size is large");
                break;
            default:
                System.out.println("We do not have that ");
        }
        Screen sc=new Screen();
        sc.printInfo();

        Screen.Data dt=new Screen.Data();
        dt.informationDisplay();
        /*
        if your inner class is static you do not need to use object from screen class
        if your inner class is not static you do need to use object from screen class

         */
    }
}
