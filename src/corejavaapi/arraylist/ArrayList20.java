package corejavaapi.arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList20 {
    public static void method1() {
        ArrayList<Integer>numbers=new ArrayList();          // 5th way to create ArrayList
        numbers.add(10);
        numbers.add(12);
        numbers.add(17);
        numbers.add(36);
        numbers.add(39);
        numbers.add(45);
        System.out.println(numbers);                        // print as ArrayList
        for (Integer number:numbers){
            System.out.println(number);                     // print all elements of the ArrayList
            if (number%2==0){                               // find the even numbers in ArrayList
            System.out.println(number+"is an even number"); // print even numbers
            }
        }
        Object[] array=numbers.toArray();                   // Converts ArrayList to Array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"");                // Print the array as a String
        }
        System.out.println(Arrays.toString(array));         // print array elements as string

    }
    public static void method2(){
        ArrayList<String>cars=new ArrayList<String>();      // 4th way of creating ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Fiat");
        cars.add("Land Rover");
        cars.add("Subaru");
        System.out.println(cars);                           // prints all ArrayList
        Scanner input=new Scanner(System.in);
        for(String car:cars){
            System.out.println("Please enter the car brand");
            if (input.nextLine().equals("BMW")) {
                System.out.println("You are lucky. We have your brand in inventory");
                break;
            }else{
                System.out.println("Nice brand, but we do not have it");
            }
        }
        Object[]array=cars.toArray();
        System.out.println(array);
    }
    public static void method3(){
            ArrayList<String> cars=new ArrayList<String>();     // 4th way of creating ArrayList
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Honda");
            cars.add("Fiat");
            cars.add("Land Rover");
            cars.add("Subaru");

            for (int i=0;i<cars.size();i++){
                System.out.println(cars.get(i));                //to access an item in ArrayList

            }
            cars.add("Tesla");                                  //[Volvo,BMW,Honda,Fiat,Land Rover, Subaru,Tesla]
            System.out.println(cars);

            cars.set(0,"Hyundai");                              //[Hyundai,BMW,Honda,Fiat,Land Rover, Subaru,Tesla]
            for (int i=0;i<cars.size();i++){
                System.out.println(cars.get(i));
            }
            System.out.println(cars);
    }
    public static void method4(){
        ArrayList<String>cars=new ArrayList<String>();      //4th way of creating ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);                           // [Volvo,BNW,Ford,Mazda]
        System.out.println(cars.get(0));                    // Volvo

        Collections.sort(cars);                             // sorts as alphabetical order[BMW,Ford,Mazda,Volvo]
        System.out.println(cars);                           // [BMW,Ford,Mazda,Volvo]

        for (String car:cars){
            System.out.println(car);                        //BMW
                                                            //Ford
                                                            //Mazda
                                                            //Volvo
        }
    }

    public static void method5(){
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(33);
        numbers.add(15);
        numbers.add(20);
        numbers.add(34);
        numbers.add(8);
        numbers.add(12);
        System.out.println(numbers);                // print the ArrayList
        Collections.sort(numbers);                  // sort the ArrayList
        System.out.println(numbers);                // [8,12,15,20,33,34]
        for (Integer number:numbers){
            System.out.println(number);             // 8 12 15 20 33 34
        }
    }

    public static void main(String[] args) {
     method1();
     method2();
     method3();
     method4();
     method5();
    }
}
