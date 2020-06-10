package methodsandencapsulation.lambdas;

public class GreeterImplementation implements Greeter {
    @Override
    public void greeting() {
        System.out.println("Hello Java");
    }
    public String getName(String id){
        return "Techtorial";
    }
}
