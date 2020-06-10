package classdesign.inheritance1;

public class DomesticAnimals extends Animal{
    public boolean friendly() {
        return true;
    }

    @Override
    public void run() {
        animalName="Domestic animal";
        System.out.println("Domestic animal can run upto 10 miles per hour");
    }
    @Override
    public void eat(){
        System.out.println("Domestic animals eat healty food");
    }
}
