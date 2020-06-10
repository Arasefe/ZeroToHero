package operatorsandstatements.conditionstatements;

public class IfStatementUnaryExercise {
    public static void main(String[] args) {
        int k=4;
        if (k>3) {
            k++;    //5
            k++;    //6
        }
        System.out.println(k);      //6

        int r=4;
        if (r>3){
            r++;    //5
            r++;    //6
        }
        System.out.println(r);       //6

        int t=2;
        if (t>3){   //false so body will not be executed. If it were true then
            t++;    // this line execution will change according to if statement
            t++;    // this line will be executed every time.
        }
        System.out.println("t is" + t); //2

        int d=5;
        if(d>7){    // false so body will not be executed. If it were true then
            d++;    // 6
            d++;    // 7
        }
        System.out.println(d);          // 5

        int x=8;
        int f=6;
        if (x<f){   //false so body will not be executed. If it were true then
            x++;    // 9
            ++f;    // 7
            x--;    //8
        }
        System.out.println(x);          // 8
        System.out.println(f);          // 6

        int a=5;
        int b=6;
        if (a<b){   // true thus the body will be executed.
            a++;    // 6
            ++b;    // 7
            a--;    // 5
    }
        System.out.println(a);          // 5
        System.out.println(b);          // 7

}
}

