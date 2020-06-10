package buildingblocks.primitives;

public class Numbers {
    public static void main(String[]args){
       byte phones=127;
       byte bankAccount=-128;


       short cornNumber=32767;
       int chicagoPopulation=8000000;
       long worldPopulation= 8_000_000_000L;
       /*

       If you store decimal numbers to float data types.
    You meed to provide the “f” at the end of your value.
    Inside byte, short, int and long, decimal numbers can not be stored.
    boolean----> only i can store true or false,
    char----> Only single character can be stored
        */

        float bananaPrice=0.48f;
        System.out.println(bananaPrice);
        boolean isLightOn=true;
        boolean isClassOver=false;
        char firstLetter='A';
        int letterA='A';
        System.out.println(letterA);
        System.out.println(isClassOver);




    }
}
