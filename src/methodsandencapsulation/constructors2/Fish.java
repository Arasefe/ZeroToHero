package methodsandencapsulation.constructors2;

public class Fish {
    protected int size;
    private int age;



    public Fish(int age){
      this.age=  age;
    }

    public int getAge() {
        return age;
    }
}
class Shark extends Fish{
    private int numberOfFins=8;
    public Shark(){
        super(5);
        this.size=4;
    }
    public void displaySharkDetails(){
        System.out.println("Shark with age "+ getAge());
        System.out.println("and " + size + " meters long");
        System.out.println("with " + numberOfFins + " fins");
    }

    public static void main(String[] args) {
        Shark shark=new Shark();
        shark.displaySharkDetails();
    }
}
