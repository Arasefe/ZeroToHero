package collections.setcollection;

public class Flower {
    String name;
    String color;


   public Flower (String name, String color){
       this.name=name;
       this.color=color;

   }
   public  String toString (){

       return "Name of the flower is "+ name + " The color of the flower is "+ color;
   }
        //every System.out.printLn() calls toString method.
        //If the class has no toString method, it will come from the Object class.
        //We create toString method in this class to print our instance variables in any format which we created.
        // Print all the object color if object name is starting with B
}
