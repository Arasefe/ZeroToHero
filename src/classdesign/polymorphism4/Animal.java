package classdesign.polymorphism4;

    public class Animal {
        public String getName() {                  //method
        return "Animal"; }
    }
    class Gorilla extends Animal {
        public String getName() {                  //method overriding
            return "Gorilla"; }
    }
    class ZooKeeper {
        public static void main(String[] args) {
            Animal animal = new Gorilla();          // upcasting
            System.out.println(animal.getName()); 
        }
    }


