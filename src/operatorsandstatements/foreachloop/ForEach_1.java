package operatorsandstatements.foreachloop;

public class ForEach_1 {
    public static void forEach(){
        final String[]names=new String[4];
        names[0]="Lisa";
        names[1]="Kevin";
        names[2]="Roger";
        names[3]="Isaac";

        for(String name:names){

            System.out.println(name.toString());
        }
    }

    public static void main(String[] args) {
        forEach();
    }
}
