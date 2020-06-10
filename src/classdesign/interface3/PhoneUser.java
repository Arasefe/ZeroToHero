package classdesign.interface3;

public class PhoneUser extends Iphone {
    @Override
    public void playMusic(){
        System.out.println("Playing music from mobile phone user class");


    }
    @Override
    public Object storeFiles(){
        return "User is storinh files in icloud";
    }
    public static void main(String[] args) {
//        MobilePhone mobilePhone=new MobilePhone();
//        // mobilePhone will have variables and method of MemoryCard, HeadPhones, Phone
//
//        HeadPhones headPhones=new MobilePhone();
//        headPhones=new PhoneUser();
//        headPhones.playMusic();
//        ((MobilePhone)headPhones).storeFiles();     //Down Casting
//        // REFERENCE SIDE CAN BE ABSTRACT CLASS, REGULAR CLASS OR INTERFACE BUT OBJECT SIDE MUST BE REGULAR CLASS
//        Phone phone=new MobilePhone();

        Phone phone=new Iphone();       //Parent class=new Child class (Polymorphism object)
        phone.regularMethod();
        ((Iphone)phone).faceId();
        System.out.println(phone.storeFiles());
    }
}
