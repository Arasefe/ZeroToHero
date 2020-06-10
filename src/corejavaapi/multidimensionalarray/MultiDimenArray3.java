package corejavaapi.multidimensionalarray;

public class MultiDimenArray3 {
    public void methodArray(){
        String [][]arr=new String[3][2];
        arr[0][1]="can";
        arr[0][0]="Empty";
        arr[1][0]="makes";
        arr[1][1]="noise";
        arr[2][0]="far";
        arr[2][1]="more";
        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr[i].length;k++) {
                System.out.println(arr[i][k]);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        MultiDimenArray3 obj=new MultiDimenArray3();
        obj.methodArray();
    }
}
