package classdesign.encapsulationMusa;

public  class EncapsulationPractice {

    public String title;
    private long INDIVIDUAL_SSN = 237239723;
    private double salary = 100_000;
    private long balance;

    protected String address;
    protected String DOB;

    public long getSSN() {
        return INDIVIDUAL_SSN;
    }

    public void setINDIVIDUAL_SSN(long INDIVIDUAL_SSN) {
        this.INDIVIDUAL_SSN = INDIVIDUAL_SSN;
    }

    public void setSalary(double salary) {
        if (salary < 100_000) {
            throw new RuntimeException("The salary can not be less than 100000");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    static class Nested{

    }
}
