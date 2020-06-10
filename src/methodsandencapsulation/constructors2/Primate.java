package methodsandencapsulation.constructors2;

public class Primate {
    public Primate(){
        System.out.println("Primate");

    }
}

class Ape extends Primate{
    public Ape(){
        System.out.println("Ape");

    }
}

 class Chimpanzee extends Ape{
    public Chimpanzee(){

    }
     public static void main(String[] args) {
         new Chimpanzee();
     }
}
