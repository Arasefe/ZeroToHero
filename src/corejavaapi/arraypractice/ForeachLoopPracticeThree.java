package corejavaapi.arraypractice;

public class ForeachLoopPracticeThree {
    public static void main(String[] args) {
         /*
        Create int of array element number is 10. Print all the int elements if it is more than 50 .
        Using foreach loop.
         */
         int  []numbers={1,4,6,8,9,12,34,45,667,567};
         for (int number:numbers){
             if (number>50){
                 System.out.println(number);
             }
         }

    }
}


