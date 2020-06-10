package corejavaapi.multidimensionalarray;

public class MultiDimenArray4 {
    public static void method(){

        String[][]arr=new String[][]{{"Do","Everything"},{"if","you"},{"want","life"}};
        for(String[]inner:arr){
            for(String inn:inner){
                System.out.println(inn+" ");
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        method();
    }
}
