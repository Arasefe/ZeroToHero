package javabuildingblocks.object;

public class Cat {
    /*
    Create cat class with 6 instance variables. Name, age, color, isRunning, kind,speed.
    Create one method start returns boolean. This method will change the value of isRunning to the true.
    Create method named stop returns boolean, this method will change the value of isRunning to the false.
    Create one method to display all cat info.
     */
    String name;
    String color;
    int age;
    boolean isRunning;
    String kind;
    int speed;
    String destination;

    public boolean start() {         // We have to create the method in cat class not in test
        isRunning = true;             // if (isRunning==true){
        // isRunning=true;
        speed = 10;
        return isRunning;
    }

    public boolean stop() {
        isRunning = false;
        speed = 0;
        return isRunning;
    }

    public void accelerate(int targetSpeed) {          // int targetSpeed=20;
        int currentSpeed = speed;
        while (currentSpeed < targetSpeed) {
            System.out.println(currentSpeed);
            currentSpeed++;
        }
        speed=currentSpeed;
    }
    public void run() {
        start();                                        // speed 10, isRunning true;
        System.out.println("The cat is running");
    }
    public void run(String destination){
        start();
            System.out.println(name+"is running.The destination is" + destination);
        }

    public void run(String destination, int totalDistance){
        start();
        System.out.println(name+"is running.Destination is " + destination+ "total distance is "+ totalDistance);
    }

    public void run(int totalDistance,String destination){
        start();
        System.out.println(name +"is running.Destination is"+ destination+"and total distance is "+ totalDistance);
    }

    public void run(int ...num){
        System.out.println("The first value is" +num[0]);         // first value
        System.out.println("The last value is"+ num[num.length-1]);
    }
    /*
     public void run (int ...numbers){

    }
    */












        public void displayInfo () {

            System.out.println("The cat name is " + name);
            System.out.println("The cat age is " + age);
            System.out.println("is the cat running " + isRunning);
            System.out.println("The cat color is " + color);
            System.out.println("The cat kind is " + kind);
            System.out.println("The cat speed is " + speed);

        }
    }