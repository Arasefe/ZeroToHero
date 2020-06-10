package corejavaapi.arraypractice;

public class FindCountStringArray1 {
    public static void main(String[] args) {
        /*
        Azhar, Timea,Asan, Dmitry, Erma, Tima, Jamilya,Asan,Tima
        Find how many times each names displayed in Array and print following format.
        Azhar--->1
        Tima---->3
         */
        int i;
        int k;
        int count=1;
        String[] sNames = {"Azhar", "Tima", "Asan", "Dmitry", "Erma", "Tima", "Jamilya", "Asan", "Tima"};
        // String [] countedNames={"Azhar", "Tima","Asan", "Dmitry", "Erma",

        for (i = 0; i < sNames.length; i++) {
             count=1;
            for (k = i + 1; k < sNames.length; k++) {
                if (sNames[i].equals(sNames[k])) {

                }
                    count++;
                }
            }
       System.out.println(sNames[i]+"count is" +count );
        }
    }