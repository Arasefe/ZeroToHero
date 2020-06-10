package operatorsandstatements.optionallabel;
/*
print the names once you find Priyanka break the entire Loop.
Create one method that takes one multidimensional array as a parameter
Call the method and pass names1 as a parameter
 */
public class OptionalLabel3 {
    public static void breakMethod(String[][]names){
        OUTER_LOOP: for (int i=0;i<names.length;i++){
           INNER_LOOP:  for(int k=0;k<names[i].length;k++){
            if(names[i][k].equals("Priyanka")){
                break OUTER_LOOP;

               }
               System.out.println(names[i][k]);
           }
        }

    }

    public static void main(String[] args) {
        String[][]names={{"Adam","John"},{"Kushal","Priyanka","Sameer"},{"Lee","Mao"}};

        breakMethod(names);
    }
}
