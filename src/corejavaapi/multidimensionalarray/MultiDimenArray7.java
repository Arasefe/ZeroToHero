package corejavaapi.multidimensionalarray;

public class MultiDimenArray7 {
    public static void method(){

        int[][] numbers=new int[][]{{12,32,34},{54,56,67},{87,89,99},{123,43,234}};
            for(int [] number:numbers){
                for(int num:number){
                    System.out.println(num+" ");
                    System.out.println();
                }

            }

    }

    public static void main(String[] args) {
        method();
    }
}
