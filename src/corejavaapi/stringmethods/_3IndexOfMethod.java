package corejavaapi.stringmethods;

public class _3IndexOfMethod {
    public void indexOfMethod(){
        String str="animals";
        System.out.println(str.indexOf('a'));                   //0
        System.out.println(str.indexOf('n'));                   //1
        System.out.println(str.indexOf('m'));                   //3
        System.out.println(str.indexOf("al"));                  //4
        System.out.println(str.indexOf('a',3));   //4
        System.out.println(str.indexOf("al",3));  //4
        System.out.println(str.indexOf("al",5));  //-1
    }

    public static void main(String[] args) {
        _3IndexOfMethod ind=new _3IndexOfMethod();
        ind.indexOfMethod();
    }
}
