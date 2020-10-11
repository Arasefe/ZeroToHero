package classdesign.abstractionMusa;

public abstract class Animal {
    String name;

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void sleep(double duration){
        System.out.println(name+" is sleeping "+duration +" hours");
    }


    public abstract String eat();

    public abstract void drink();

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name +
//                '}';
//    }
}
