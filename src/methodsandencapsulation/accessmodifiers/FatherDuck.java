package methodsandencapsulation.accessmodifiers;

public class FatherDuck {
    private String noise="quack";
    private void quack(){
        System.out.println(noise);
    }
    private void makeNoise(){
        quack();
    }

}
