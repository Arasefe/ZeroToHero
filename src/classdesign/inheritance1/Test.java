package classdesign.inheritance1;


public class Test {
    public static void main(String[] args) {


        DomesticAnimals dAnimal=new DomesticAnimals();
        System.out.println(dAnimal.friendly());
        dAnimal.sleep();
        dAnimal.run();                                  // calls last overridden method
        dAnimal.friendly();
        Animal animal=new Animal();
        animal.run();

        Lion lion=new Lion();
        lion.run();
        lion.hunt();
        lion.sleep();

        WildAnimals wildAnimals=new WildAnimals();
        wildAnimals.hunt();
    }
}
