package corejavaapi.arraypractice;

public class StringArraySorting2 {
    public static void main(String[] args) {

/*
TASK
create String cars array the size is five and stor the car names. BMW, TOYOTA, HONDA,MERCEDES
Using the loops print the name of the cars.
*** if element value is equals to Honda print the value,
*** cars[i] ---> will return String, so we are to use .equals();
 */

        String[] cars = { "BMW", "Toyota", "Honda", "Mercedes"};
        for (int i=0;i<cars.length;i++){
            if (cars[i].equalsIgnoreCase("honda")){
                System.out.println("The names of the cars"+ cars[i]);

            }

        }
    }
}
