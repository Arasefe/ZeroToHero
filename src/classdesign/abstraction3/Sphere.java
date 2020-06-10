package classdesign.abstraction3;

public interface Sphere {
    default String getName(){
        return "unknown";
    }
}
abstract class Planet{
    abstract String getName();
}
class Mars extends Planet implements Sphere{
    public Mars(){
        super();
    }
    @Override
    public String getName() {
        return "Mars";
    }

    public static void main(String[] args) {
        System.out.println(new Mars().getName());
    }
}
