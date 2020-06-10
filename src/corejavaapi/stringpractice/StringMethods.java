package corejavaapi.stringpractice;

public class StringMethods {
    public static void main(String[] args) {
        String lengthOfValue="This method will give length of the String";
        int result=lengthOfValue.length();
        System.out.println(result);

        System.out.println(lengthOfValue.charAt(41));

        String bookName="Potential";
        bookName=bookName.concat(" of the class");
        System.out.println(bookName);



        String soccerPlayer="Cristiano";
       // soccerPlayer.concat("Ronaldo"); // there is no reassignment for the last name
        // System.out.println(soccerPlayer);
        soccerPlayer=soccerPlayer.concat("\n\tRo\n\tnaldo");
       // System.out.println(soccerPlayer.charAt(-1));
        System.out.println(soccerPlayer);



        String computer="Macbook Computer";
        System.out.println(computer.indexOf("b")); //3
        System.out.println(computer.indexOf("ok")); //5
        System.out.println(computer.indexOf("t")); //-1 if there is no matching String value, it will return -1
        System.out.println(computer.indexOf("o")); //4 if there are more than one matching value, it will return indext number for first matching
        System.out.println(computer.indexOf("o",7)); //9 If you use index number in indexOf method, it will start seacrhing from given index.
        // IndexOf method will return the integer value.
        System.out.println(computer.indexOf("b",3));


    }

}
