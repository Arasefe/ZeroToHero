package corejavaapi.stringbuilder;

public class StringBuilder6 {
        public static void main(String[] args) {
            StringBuilder a=new StringBuilder("abc");
            StringBuilder b=a.append("de");
            b=b.append("f").append("g");


            System.out.println("a = " +a );         //a = abcdefg because both references pointing the same mutable object

            System.out.println("b = " +b );         //b = abcdefg

            }

        }
