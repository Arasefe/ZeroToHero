package methodsandencapsulation.lambdas;

public class LambdaPractice {
    public int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
       PracticeInterface  myBlockOfCode= (x, y)->  x+y;
        System.out.println(myBlockOfCode.getSum(213,433));

        }
    }

    //(x,y)->x+y;


