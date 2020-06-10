package corejavaapi.arraypractice;

public class CountCharacterInArray3 {
    public static void main(String[] args) {
        /*
        Create a  string of array element number is 8. Print all the strings that have 't' in it and with the
        info of how many numbers of t they have.
        String []sNames={"Murat", "Hasan","Ali", "Selcuk","Huseyin","Mahmut", "Kamil", "Vahit"};
         */
        String []names={"Murat", "Hasan","Ali", "Selcuk","Huseyin","Mahmut", "Kamil", "Vahit"};
        for (String name:names){
            int count=0;
            for (int i=0; i<name.length();i++){
            if (name.charAt(i)=='t' || name.charAt(i)=='T'){
                count++;

            }

        }
            System.out.println(name+ " has "+ count+"t");

    }
}
}
