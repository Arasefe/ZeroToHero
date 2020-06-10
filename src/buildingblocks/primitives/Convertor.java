package buildingblocks.primitives;

public class Convertor {
    public static void main(String[] args) {
       // byte tempFahrenheit= 72;
        // int tempCelcius=(tempFahrenheit-32)*5/9;
        //System.out.println(tempCelcius);
        int k=7;
        int n=3;
        int result=k++*++n/++n%k+n-k++;
        int $result=k+k++*k-n++%n+++n;
        System.out.println("k is"+k);
        System.out.println("n is " + n);
        System.out.println("result is"+ result);
        System.out.println("$Result is" + $result);
    }
}
