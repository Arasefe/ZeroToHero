package methodsandencapsulation.constructors;

public class Company {
    String name="Techtorial";
    String Location="Chicago";
    String businessType="Education & Consultancy";
    int employeeNumber=12;
    int yearlyBudget=120000;

    public Company (String name,String location,String businessType,int employeeNumber,int yearlyBudget){
        this.name=name;
        this.Location=location;
        this.businessType=businessType;
        this.employeeNumber=employeeNumber;
        this.yearlyBudget=yearlyBudget;

    }
    public void displayInfo(){
        System.out.println(name);
        System.out.println(Location);
        System.out.println(businessType);
        System.out.println(employeeNumber);
        System.out.println(yearlyBudget);

    }

    public static void main(String[] args) {
        Company a=new Company("Wlagreans","Deerfield","Pharmacy",500,10000000);
        Company b=new Company("Chase","Chicago","Finance",500,500000000);
        Company c=new Company("Bank Of America","Dllas","Finance",400,245000000);
        Company d=new Company("USBANK","Oregon","Construction",300,650000000);
        Company e=new Company("CVS","Deerfield","Pharmacy",200,10000000);

        a.displayInfo();
        b.displayInfo();
        c.displayInfo();
        d.displayInfo();
        e.displayInfo();

    }
}
