package corejavaapi.stringmethods;

public class _16MethodChaining2 {
    public void methodChain(){
        String a="abc";
        String b=a.toUpperCase();
        b=b.replace("B","2").replace('C','3');
        System.out.println("a="+ a);        //abc
        System.out.println("b="+ b);        //A23
    }

    public static void main(String[] args) {
        _16MethodChaining2 chain=new _16MethodChaining2();
        chain.methodChain();
    }
}
