package operatorsandstatements.optionallabel;

public class OptionalLabel4 {

    public static void labelMethod() {

        //0
        //0,1,2,3,4,5
        int i=0;

        OUTER_LOOP: for ( i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 5) {
                    break OUTER_LOOP;
                }
            //    System.out.println(i);
            }
          //  System.out.println(i);
        }
        System.out.println(i);

    }

    public static void main(String[] args) {

       labelMethod();

    }

}
