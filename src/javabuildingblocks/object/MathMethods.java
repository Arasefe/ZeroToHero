package javabuildingblocks.object;

public class MathMethods {
    public int square (int number){
        int squareNum=number*number;
        return squareNum;
    }
    public void multiplicationValue(int number){
        for (int i=0; i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
    public int sum(int num1, int num2){
        return num1+num2;
    }

    public int sumArray(int []numbers){
        int sum=0;
        for (int i=0;i<numbers.length;i++){
            sum+=sum+numbers[i];
        }
        System.out.println("The sum of the array is " + sum);
        return sum;
    }
    public void printLetter (String string){
        for (int i=0; i<string.length();i++){
            System.out.println(string.charAt(i));
        }

    }


    public static void main(String[] args) {
        MathMethods test=new MathMethods();

        int result=test.square(11);
        System.out.println(result);
        test.multiplicationValue(5);
        int resultSum=test.sum(23456,567);      // just example
        System.out.println(resultSum);

        int []nums={10,5,20,40,30};
        test.sumArray(nums);

        int [] values={10,5,20,40,30,3,54,7,2346,78,2,257,5};
        test.sumArray(values);

        /*
        task
        Write the method will take one parameter as a String value. It will print all the char from String value.
         */
        test.printLetter("Techtorial Academy");
        test.printLetter("School");

    }

}
