package operatorsandstatements.nestedforloops;

public class NestedForLoop2 {
    public static void nestedForMethod(){
        int [][]myComplexArray={{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for (int[]mySimpleArray:myComplexArray){
            for (int i=0;i<mySimpleArray.length;i++){
                System.out.println(mySimpleArray[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nestedForMethod();
    }
}
