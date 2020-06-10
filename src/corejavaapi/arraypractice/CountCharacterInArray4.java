package corejavaapi.arraypractice;
import java.util.Scanner;
public class CountCharacterInArray4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the car brands you like most: ");
        String cars[]=new String [6];
        int i=0;
        int count=0;
        for (i=0;i<cars.length;i++){
            cars[i]=input.nextLine();
            if (cars[i].charAt(i)=='t'||cars[i].charAt(i)=='T'){
                count++;
            }
            System.out.println(cars[i]+"has "+ count+ "t");

        }
        //System.out.println(cars[i]+"has "+ count+ "t");
    }
}
