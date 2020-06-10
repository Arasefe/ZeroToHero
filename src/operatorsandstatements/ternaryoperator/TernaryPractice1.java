package operatorsandstatements.ternaryoperator;

public class TernaryPractice1 {
    public static void main(String[] args) {
        int space=5;
        int passenger=6;
        System.out.println(space>=passenger ? space-passenger : "They can not fit");

        int result=space>=passenger ? space-passenger : space+passenger;
        // space 6 and passenger 6
        System.out.println(space<passenger ? passenger-- : space++);    //6

        System.out.println(passenger);  //
        System.out.println(space);      //

        int number=10>6 ? 10 : 10;
        System.out.println(number);

        String str=6>4 ? "Hello" : "Java";
        System.out.println(str);


    }

}
