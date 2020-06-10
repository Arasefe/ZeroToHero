package corejavaapi.arraypractice;

public class CountCharacterInArray1 {
    public static void main(String[] args) {
        /*
        Create a  string of array element number is 6. Print all the strings that have how many numbers of a they have.
        String []sNames={"Aiturgan", "Aizhana","Azharkin", "Dmitry","Erma","Jamilya"};
         */
        String[]sNames={"Aiturgan", "Aizhana","Azharkin", "Dmitry","Erma","Jamilya"};
        for (String name:sNames){
            int count=0;

            for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='A' || name.charAt(i)=='a'){
                count++;

            }
        }
            System.out.println(name+ " A count is ----->"+count);

        }
    }
}
