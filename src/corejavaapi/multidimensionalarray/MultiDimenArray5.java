package corejavaapi.multidimensionalarray;

public class MultiDimenArray5 {
    public static void method(){
        String[][]arr=new String[3][2];
        arr[0][0]="Do";
        arr[0][1]="Everything";
        arr[1][0]="if";
        arr[1][1]="you";
        arr[2][0]="want";
        arr[2][1]="life";
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
