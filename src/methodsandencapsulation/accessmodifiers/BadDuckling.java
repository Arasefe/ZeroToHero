package methodsandencapsulation.accessmodifiers;

public class BadDuckling {
    public void makeNoise(){
        FatherDuck duck=new FatherDuck();
        //duck.quack();---> Has private access modifier so DOES NOT COMPILE
        //System.out.println(duck.noise);---> DOES NOT COMPILE
    }
}
