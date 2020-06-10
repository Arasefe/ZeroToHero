package methodsandencapsulation.constructors2;

public class Animal_ {
    private int age;
    private String name;

    public Animal_(int age, String name){
        super();
        this.age=age;
        this.name=name;
    }
    public Animal_(int age){
        super();
        this.age=age;
        this.name=null;
    }
}
