package classdesign.polymorphism4;

public class Bird {
    private void fly(){                         //private method can ONLY be hidden not overridden
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird=new Pelican();
        bird.fly();
    }
    static class Pelican extends Bird{
        protected void fly(){
            System.out.println("Pelican is flying");
        }
    }
}
