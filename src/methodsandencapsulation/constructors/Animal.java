package methodsandencapsulation.constructors;

public class Animal {
        String name;
        String location;
        public Animal(String name, String location){
            this.name=name;
            this.location=location;
        }
        public static void main(String[] args) {
            Animal animal=new Animal("Pars","USA");
            //whence we create the object the constructor will be called.
            // java creates default constructor but once we create the constructor with parameter, default constructor disappears.

    }
}
