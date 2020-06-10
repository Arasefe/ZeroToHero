package methodsandencapsulation.initializationorder;

public class Practice {

    private String name = "Torchie";

        {
            System.out.println(name);
        }                                               /*ORDER OF INITIALIZATION
                                                     1. Super class if there is,
                                                     2. Static variable declarations and static initializers,
                                                     3. Instance variable declarations and instance initializers,
                                                     4. Constructor
                                                    */

        private static int COUNT = 0;                   //for each object one time

        static {
            System.out.println(COUNT);                  //for each object one time
        }

        static {                                        //for each object one time
            COUNT += 10;
            System.out.println(COUNT);
        }

        public Practice() {
            System.out.println("Constructor");
        }
    }

    class CallPractice1 {
        public static void main(String[] args) {

            Practice pr=new Practice();
            Practice pr2=new Practice();
        }
    }


