package classdesign.abstractionMusa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Karatas");
        Animal dog2 = new Dog("Maratas");
        Animal dog3 = new Dog("Haratas");
        Animal dog4 = new Dog("Yaratas");

        Animal cat1 = new Cat("Minnos");
        Animal cat2 = new Cat("Sinnos");      //
        Animal cat3 = new Cat("Tinnos");
        Animal cat4 = new Cat("Finnos");

        Animal bird1 = new Bird("Boncuk");
        Animal bird2 = new Bird("Concuk");
        Animal bird3 = new Bird("Koncuk");
        Animal bird4 = new Bird("Foncuk");

        List<Animal> zoo = new ArrayList<>();
        zoo.addAll(Arrays.asList(new Dog("Puppy"),new Dog("Fuffy"),new Bird("Fluffy")));

//        zoo.addAll(Arrays.asList(dog1, cat1, bird1, dog2, cat2, bird2, dog3, cat3, bird3, dog4, cat4, bird4));
//        zoo.remove(1);
//        System.out.println(zoo);
//        System.out.println("+++++++++++++++++++++++++++++");
//        zoo.removeIf(p -> p.name.endsWith("tas"));
//        System.out.println(zoo);
//
//        zoo.remove(dog3);
//        System.out.println(zoo);
//        System.out.println("+++++++++++++++++++++++++++++");
//        Iterator<Animal> it = zoo.iterator();
////        while (it.hasNext()) {
////            if (it.next().name.contains("cuk")) {
////                it.remove();
////            }
////        }
//        System.out.println(zoo);
//        System.out.println("+++++++++++++++++++++++++++++");
//
//        for (int i = 0; i < zoo.size(); i++) {
//            if(zoo.get(i).name.contains("nos")){
//                zoo.remove(i);
//            }
//        }
//        System.out.println(zoo);
//        for(Animal each:zoo){
//            if(each.name.contains("tas")){
//                zoo.remove(each);
//            }
//        }
//        System.out.println(zoo);
//
//        for(Iterator<Animal> t = zoo.iterator();t.hasNext();){
//            if(t.next().name.equals("Boncuk")){
//                t.remove();
//            }
//        }
        System.out.println(zoo);

    }

}
