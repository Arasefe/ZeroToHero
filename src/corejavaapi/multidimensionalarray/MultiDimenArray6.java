package corejavaapi.multidimensionalarray;

public class MultiDimenArray6 {
    public static void method(){
        int[][] numbers=new int[][]{{12,32,34},{54,56,67},{87,89,99}};  //print all array elements with for each loop
        int sum=0;
        for(int [] number:numbers){
            for(int num:number){
                System.out.println(num+ " ");
                sum+=num;
                System.out.println();
                System.out.println(sum);
            }
        }

    }

    public static void main(String[] args) {
        method();
    }
}
