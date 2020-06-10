package corejavaapi.arraypractice;

public class ArrayOddEven {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 2;

        }
        for(int i=0;i<numbers.length;i++){
            System.out.println("Element "+ i +" is "+numbers[i]);
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]+"is an odd number");
            }
            else{
                System.out.println(numbers[i]+"is an even number");
            }
        }
        }

    }

