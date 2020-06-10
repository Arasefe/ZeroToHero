package methodsandencapsulation.initializationorder;

public class Practice3 {
    static String result="";                        //static class variable thus there is no need for object
    {result+="c";
        System.out.println("instance1");            //instance
    }
    static{ result+="u"; }                          //static

    {result +="r";
        System.out.println("instance2");            //instance
    }

    public static void main(String[] args) {
        System.out.println(Practice3.result+"");    //u
        System.out.println(Practice3.result+"");    //u
        new Practice3();                            //u u ucr
        new Practice3();                            //u u ucrcr
        System.out.println(Practice3.result+"");
    }
}
