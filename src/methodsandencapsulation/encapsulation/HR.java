package methodsandencapsulation.encapsulation;

public class HR {
    public static void main(String[] args) {
        Departments department= new Departments("IT",101);
        Employees employees=new Employees("Sarah", 100,"SDET",department);

        int departmentId=employees.getDepartments().getDepartmentId();
        System.out.println(departmentId);           //101
        employees.getDepartments().setDepartmentName("SALES");
        Employees employees1=new Employees("John",95,"Developer",department);
        Employees employees2=new Employees("Mark",105,"SDET",department);
        Employees employees3=new Employees("Patel",110,"Product Owner",department);

        Employees[]allEmployees=new Employees[]{employees,employees1,employees2,employees3};
        // print all employees Name  who works in department-id 101 and salary is more than 100;
        for (Employees employee:allEmployees){
            if (employee.getDepartments().getDepartmentId()==101 && employee.getSalary()>=100){
                System.out.println(employee.getName());
            }
        }
        department.setDepartmentId(1010);       //it will change the name of the department id for everyone
    }
}
