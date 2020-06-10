package operatorsandstatements.whileloop;

public class WhileLoop11 {
    public static void main(String[] args) {
        int m=9,n=1,x=0;
        while(m>n){
            m--;    //9,8,7
            n+=2;   //3,5,7
            x+=m+n; //11,13,14
        }
        System.out.println(x);
    }
}
