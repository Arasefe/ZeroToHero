package classdesign.abstraction2;


public abstract class Shapes {
    String name;


    public abstract Number getArea();       //abstract method

    public Shapes(String name){             //non-abstract method
        this.name=name;
    }
    abstract void draw();                   //abstract method

}
