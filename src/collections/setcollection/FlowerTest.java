package collections.setcollection;

import java.util.HashSet;
import java.util.Set;

public class FlowerTest {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose", "Red");
        Flower flower2 = new Flower("Begonia", "Blue");
        Flower flower3 = new Flower("Bee Balm", "Red");
        Flower flower4 = new Flower("Tulip", "Yellow");
        Flower flower5 = new Flower("Begonia", "Red");

        Set<Flower> flowerList=new HashSet<Flower>();                 // will accept Object data type as Flower

        flowerList.add(flower1);
        flowerList.add(flower2);
        flowerList.add(flower3);
        flowerList.add(flower4);
        flowerList.add(flower5);

        for (Flower flower:flowerList){
            System.out.println(flower);
        }
        for(Flower flower:flowerList) {
            if (flower.name.startsWith("B")){
                System.out.println(flower.name+" "+flower.color);
            }
        }

    }
}
