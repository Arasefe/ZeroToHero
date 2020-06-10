package corejavaapi.stringbuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder strBuilder=new StringBuilder("Java is my world. ");
        /*
        Dynamic polymorphism is until runtime java does not know which method to use.
        Java will decide while runtime even if you input wrong method parameter,
        java will use the method according to your parameter.
         */
        //StringBuilder strBuilder="Java is my world";
        strBuilder.append(" I will succeed no matter how hard it can be. ");
        System.out.println(strBuilder);
    }
}
