package corejavaapi.arraypreperation;

public class ArrayPractice12 {
    public static void main(String[] args) {
        int[]a={75,29,350,7,4192};
        System.out.println(a[3]);  // index 3
        System.out.println(a[2]);
        //System.out.println(a[6]);  // index 6 outOfIndexBoundsException
        for (int i=0; i<a.length;i++ )
            System.out.println("Adaptive Iteration" + a[i]); // Adaptive Iteration
        alternate();



    }
    public static void alternate(){

        int[]b={75,29,350,7,4192};
        for (int i=0; i<5;i++) {
            System.out.println(b[i]);
        }

    }

}

