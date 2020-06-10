package classdesign.interface1;

interface Aquatic {
    public default int getNumberOfGills(){
        return 2;
    }
    public class ClownFish implements Aquatic{
        public int getNumberOfGills(){                  //Method Overriding
            return 4;
        }
        public String getNumberOfGills(int input){      //Method Overloading
            return "6";
        }

        public static void main(String[] args) {
            System.out.println(new ClownFish().getNumberOfGills(-1));
        }
    }
}
