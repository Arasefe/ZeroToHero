package classdesign.interface3;

public class Iphone extends Phone{
    @Override
    public Object storeFiles() {
        return "Iphone is storing files in icloud";

    }
    public void faceId(){
        System.out.println("Iphone is unlocking with face Id");
    }
}
