package corejavaapi.multidimensionalarray;

public class MultiDimenArray1 {
    public static void method(){
        String[][]arr=new String[3][4];         // 2 Dimensional and have 3 arrays of total of 4 elements
        arr[0][1]="nothing";
        arr[0][0]="everything";
        arr[1][0]="If";
        arr[1][1]="You";
        arr[2][0]="want";
        arr[2][1]="life";
       // String[][]arr=new String[][]{{"Do","Everything"},{"if","you"},{"want","life"}};
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr[i].length;k++){
                System.out.println(arr[i][k]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        method();
    }
}
