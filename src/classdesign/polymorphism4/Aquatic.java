package classdesign.polymorphism4;

public interface Aquatic {
    public default int getNumberOfGills(int input){     //default method
        return 2;
    }
}
 class ClownFish implements Aquatic{
    public String getNumberOfGills(){                   //separate method
        return "4";
    }
    public int getNumberOfGills(int input){             //
        return 6;
    }

     public static void main(String[] args) {
         System.out.println(new ClownFish().getNumberOfGills(-1));
     }
}
