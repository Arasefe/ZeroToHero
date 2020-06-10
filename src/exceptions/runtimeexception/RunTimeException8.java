package exceptions.runtimeexception;


import javax.management.RuntimeErrorException;

public class RunTimeException8 {
    public static void main(String[] args) {
        try{
            hop();
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void hop(){
        throw new RuntimeException("CAN NOT HOP");
    }
}
