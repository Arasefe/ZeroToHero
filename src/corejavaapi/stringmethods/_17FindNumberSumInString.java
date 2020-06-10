package corejavaapi.stringmethods;

public class _17FindNumberSumInString {
    public static void main(String[] args) {
        String str="asfhdjdnswewr99wr49mndsksdfh456ksdkfshdfv99";
        int sum=0;
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                String nm=""+str.charAt(i);
                int num=Integer.parseInt(nm);
                sum+=num;
            }
        }
        System.out.println("The sum of the digits of the string is "+sum);
    }
}
