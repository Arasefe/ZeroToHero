package operatorsandstatements.switchstatement;

public class SwitchStatement9 {
        private int getSortOrder(String firstName,final String lastName){
            String middleName="Patricia";
            final String suffix="Jr";
            int id=0;
            switch (lastName){
                case "YILDIRIM":
                    System.out.println("Ismail");
                    return 52;
                case suffix:
                    id=0;
                    System.out.println(id);
                    break;
            }
            return id;
        }

    public static void main(String[] args) {
        SwitchStatement9 sw=new SwitchStatement9();
        sw.getSortOrder("Ismail","YILDIRIM");
    }


    }
