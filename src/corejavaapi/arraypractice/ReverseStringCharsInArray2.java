package corejavaapi.arraypractice;

public class ReverseStringCharsInArray2 {
    public static void main(String[] args) {
        String []values={"Tech", "Array", "Polygamy", "Loyalty","Excuse"};
        for (int i=0;i<values.length;i++){
            for (int k=values[i].length()-1;k>=0;k--){
                char ch=values[i].charAt(k);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
