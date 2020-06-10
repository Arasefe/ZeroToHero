package classdesign.interface3;

public class MobilePhone extends Phone {

    @Override
    public String storeFiles() {
        return "Storing files from phone to memory card.";
    }
    @Override
    public void playMusic(){
        System.out.println("Playing music from mobile phone");
    }
}
