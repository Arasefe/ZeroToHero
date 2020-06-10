package methodsandencapsulation.accessmodifiers;

public class Robot {
    static String weight="Alot";
    double ageMonths=5,ageDays=2;
    private static boolean success=true;

    public void main(String[] args) {
        final String retries="1";
        System.out.println(weight);
        System.out.println(ageMonths);
        System.out.println(ageDays);
        System.out.println(success);
        System.out.println(retries);
    }
}
