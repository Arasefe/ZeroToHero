package javabuildingblocks.object;

public class CatTest {
    /*
    Create cat class with 6 instance variables. Name, age, color, isRunning, kind,speed.
    Create one method start returns boolean. This method will change the value of isRunning to the true.
    Create method named stop returns boolean, this method will change the value of isRunning to the false.
    Create one method to display all cat info.
     */
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.name = "Mavuk";
        cat.age = 3;
        cat.kind = "Scottish";
        cat.color = "Black";
        cat.speed=0;

        cat.displayInfo();
        cat.start();
        cat.displayInfo();
        cat.stop();
        cat.displayInfo();
        // if the cat start running speed is 10mph
        cat.start();    //  isRunning now is true
        cat.start();    // isRunning is true;
        //create the method to accelerate speeding. This method will take one parameter as target speed.
        // currentSpeed=10, targetSpeed=20-->11,12,13,14....20

        cat.accelerate(20);
        cat.accelerate(30);
        System.out.println(cat.speed);

        Cat cat1=new Cat();

        cat1.name = "Princess";
        cat1.age = 3;
        cat1.kind = "Scottish";
        cat1.color = "White";
        cat1.speed=0;

        cat1.run("Schaumburg");     // method signature run(destination:"Schaumburg")
        cat1.displayInfo();
        cat1.run("Schaumburg",15);
        cat1.displayInfo();


        }
    }
