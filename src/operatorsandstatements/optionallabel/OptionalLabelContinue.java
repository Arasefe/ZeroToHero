package operatorsandstatements.optionallabel;

public class OptionalLabelContinue {
    public void firstCharMethod(){
       OUTER_LOOP: for(int a=1;a<=4;a++){       //a 1,a 2,a 3,a 4
            for(char x='a';x<='c';a++){         //
                if(a==2||x=='b'){
                    continue OUTER_LOOP;
                }
                System.out.println(""+a+x);

            }

       }
    }

    public static void main(String[] args) {
        OptionalLabelContinue lb=new OptionalLabelContinue();
        lb.firstCharMethod();
    }
}
