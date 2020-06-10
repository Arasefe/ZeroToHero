package methodsandencapsulation.passbyvalue;

public class PassByValue1 {
    public static void updateNumber(int number){
        number=10;
        /*
        Once we pass the data to our method, java will take the copy of the data and manipulate it.
        Java is working with pass by value.
        Pass by reference-It will change the original;
        value if the language is working with pass by reference
         */
    }
    public static String updateWord(String str){
        str="Java is my world";
        return str;
    }
    public static void main(String []args){
        int number=5;
        String str="Java";

        updateNumber(number);
        System.out.println(number);

        updateWord(str);
        System.out.println(str);
        System.out.println(updateWord("School"));   // Java is my world. because return type is Java is my world

    }
}
