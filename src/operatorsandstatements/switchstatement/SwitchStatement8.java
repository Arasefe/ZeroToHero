package operatorsandstatements.switchstatement;

public class SwitchStatement8 {
    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "Jr";
        int id = 0;
        switch (lastName) {
            case "YILDIRIM":
                id=5;
                System.out.println(id+ " Ismail");
                //return 52;
            case suffix:
                id = 0;
                //break;
            case "KARATEKIN":
                id = 8;
                System.out.println(id+ "Sahin");

            default:
                System.out.println("default");
        }
        return id;
    }

    public static void main(String[] args) {
        SwitchStatement8 sw = new SwitchStatement8();
        sw.getSortOrder("Sahin","YILDIRIM");
    }
}

