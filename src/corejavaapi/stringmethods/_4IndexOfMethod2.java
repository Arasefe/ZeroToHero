package corejavaapi.stringmethods;

public class _4IndexOfMethod2 {
    public static void main(String[] args) {
        String str="This is the index example";
        int index1=str.indexOf("is");           //2
        int index2=str.indexOf("index");        //12
        System.out.println(index1+" "+ index2); // 2 12
        System.out.println(str.indexOf("i"));   //2
        System.out.println(str.indexOf("T"));   //0
        System.out.println(str.indexOf("the"));  //8
        System.out.println("String length is:"+str.length());
        System.out.println("Middle of the string is" + (str.length()-1)/2);



    }
}
