package corejavaapi.arraypractice;

public class ForeachLoopPracticeOne {
    public static void main(String[] args) {
        /*
        Create string of array element number is 5. Print all the string if the length is more than 5 and String is starting with 'A'.
        Using foreach loop.
         */
        String []sNames={"Aiturgan", "Aizhana","Azharkin", "Dmitry","Erma","Jamilya"};
        for (String name:sNames){
            if (name.length()>5 && name.startsWith("A")){
                System.out.println(name);
            }
        }
    }
}
