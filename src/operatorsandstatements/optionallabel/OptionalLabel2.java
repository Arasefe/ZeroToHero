package operatorsandstatements.optionallabel;

public class OptionalLabel2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // print all the numbers
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            System.out.println("+++++++++++++++++++++++++++++++");
        }
        // print all the letters in a String array
        String []names={"ARIET", "ULAN", "MUAMMER"};

       OUTER_LOOP: for (int i=0;i<names.length;i++){
           INNER_LOOP: for(int k=0;k<names[i].length();k++){
                if(names[i].charAt(k)=='E'){
                    break OUTER_LOOP;
                }
                System.out.println(names[i].charAt(k)+",");
            }
            System.out.println();
        }
    }
}