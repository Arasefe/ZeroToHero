package corejavaapi.arraypractice;

public class Test {
    public static void main(String[] args) {
        start1(new int[]{1, 2, 3}, new int[]{3, 4, 5});
        front11(new int[]{1,2,3},new int[]{4,56,78});
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[0] == 1 || b[0] == 1) {
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }
//        System.out.println(count);
        return 0;
    }
    public static int[] front11(int[] a, int[] b) {
        int []newArray=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                newArray[i]=a[i];
                newArray[j]=b[j];
            }

        }
        return newArray;
    }
}
