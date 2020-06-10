package methodsandencapsulation.initializationorder;

public class Practice4 {

    String value="t";
    {value+="a";}
    {value+="c";}

    public Practice4(){                             //ONLY ONE CONSTRUCTOR WILL BE USED DEPENDING THE PARAMETERS
        value+="b";
    }
    public Practice4(String s){
        value+=s;
    }

    public static void main(String[] args) {
        Practice4 pr=new Practice4("f");
        System.out.println(pr.value);
    }
}
