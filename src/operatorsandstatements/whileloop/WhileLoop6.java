package operatorsandstatements.whileloop;

public class WhileLoop6 {
    public static void eatCheese (int bitesOfCheese){
        int roomInBelly=5;
        while (bitesOfCheese>0&&roomInBelly>0){
            roomInBelly--;
            bitesOfCheese--;
            System.out.println(roomInBelly);
            System.out.println(bitesOfCheese);

        }
        System.out.println(bitesOfCheese+"pieces of cheese left");
    }

    public static void main(String[] args) {
        eatCheese(1);
    }
}
