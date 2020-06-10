package corejavaapi.arraylist;

public class Continue {
    public static void main(String[] args) {
        OUTER_LOOP:for(int a=1;a<=4;a++){
            for(char x='a';x<'c';x++){
                if (x=='b')
                    continue OUTER_LOOP;
                    System.out.println(" "+a+x);
            }
        }
    }
}
