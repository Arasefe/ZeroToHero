package corejavaapi.stringbuilder;

public class StringBuilder8 {
    /*
    GAMDKJDHO2UY658HFE7KN12BL39KGAE
    Create one method it will take StringBuilder value.
    From this StringBuilder, it will print only letter between D and G
     */
    public static void searchLetter(StringBuilder stringBuilder){
        for (int i=0;i<stringBuilder.length();i++){
               char ch=stringBuilder.charAt(i);
               if (ch>='D'&&ch<'G'){
                  // System.out.println(ch);

            }
            System.out.println(ch);

        }

    }

    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("GAMDKJDHO2UY658HFE7KN12BL39KGAE");

        searchLetter(stringBuilder);
    }
}
