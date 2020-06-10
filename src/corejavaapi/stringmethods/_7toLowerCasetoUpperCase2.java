package corejavaapi.stringmethods;

public class _7toLowerCasetoUpperCase2 {
    public static void main(String[] args) {
        String str="ORDULAR ILK HEDEFINIZ AKDENIZDIR ILERI!";
        System.out.println(str.toLowerCase()); //ordular ilk hedefiniz akdenizdir ileri!
        System.out.println(str.toUpperCase()); //ORDULAR ILK HEDEFINIZ AKDENIZDIR ILERI!
        System.out.println(str.substring(8));  // ILK HEDEFINIZ AKDENIZDIR ILERI!
        System.out.println(str.toLowerCase()); // ordular ilk hedefiniz akdenizdir ileri!
        System.out.println(str.substring(22,32)); //AKDENIZDIR
        alternate1();
    }
    public static void alternate1(){
        String s="NEREDEN SEVDIM O ZALIMI";
        System.out.println(s.substring(8));  //SEVDIM O ZALIMI
        System.out.println(s.toLowerCase()); //nereden sevdim o zalimi
        System.out.println(s.substring(15,23)); //O ZALIMI

    }
}
