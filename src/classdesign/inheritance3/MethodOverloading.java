package classdesign.inheritance3;

public class MethodOverloading {
    public Number getNumber(Number number){
        System.out.println("I am returning the number");
        return 10;

    }
    protected Integer getNumber(Integer number){
        System.out.println("I am returning Integer");
        return 10;
    }
    Double getNumber(Double number){
        System.out.println("I am returning Double");
        return 10.0;
    }
    private String getNumber(int number,String name ){
        System.out.println("I am returning String");
        return "10";
    }

    public static void main(String[] args) {
        MethodOverloading mOverloading = new MethodOverloading();
        mOverloading.getNumber(22);
        mOverloading.getNumber(22.1);
        mOverloading.getNumber(22.1F);
        mOverloading.getNumber(10,"number");



    }



}
