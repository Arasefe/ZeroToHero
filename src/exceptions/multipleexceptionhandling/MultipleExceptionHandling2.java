package exceptions.multipleexceptionhandling;

public class MultipleExceptionHandling2 {
    public String exceptions(){
        String result="";
        String v=null;
        try{
            try{
                result+="before";
                v.length();
                result+="after";
            }catch (NullPointerException e){
                result+="catch";
                throw new RuntimeException();
            }finally {
                result+="finaly";
                throw new Exception();
            }
        }catch (Exception e){
            result+="done";
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        MultipleExceptionHandling2 me=new MultipleExceptionHandling2();
        me.exceptions();
    }
}
