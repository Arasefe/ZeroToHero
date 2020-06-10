package classdesign.inheritance2;

public class Vehicle {
    String vehicleName;
    int year;
    public Vehicle(String vehicleName){
        this.vehicleName=vehicleName;
        System.out.println("Vehicle one argument constructor");
    }
    public Vehicle (String vehicleName, int year){
        this(vehicleName);      //this() must be the first
        this.year=year;
        System.out.println("Vehicle two argument constructor");
    }

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("Toyota",2006);

    }
}
