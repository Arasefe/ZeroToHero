package javabuildingblocks.object;

public class StudentTest {
    public static void main(String[] args) {
        Student std1=new Student();
        std1.firstName="Mahmut";
        std1.lastName="Erbiz";
        std1.age=23;
        std1.gender='M';
        std1.nationality="USA";
        std1.totalPages=150;

        System.out.println("The first name is "+ std1.firstName);
        System.out.println("The last name is "+ std1.lastName);
        System.out.println("The  other information is "+ std1.age+"-"+ std1.gender+"-"+std1.nationality);

        std1.study("Monday");
        std1.study("Thursday");
        std1.read();
        std1.read();
        std1.read();
        std1.read();
        System.out.println(std1.totalPages);
        std1.studyTime();

        // TASK inside student class create one method to be able to read.
        // Call this method inside the student class and if you created studenttest class call in that class as well.
        // Task Create one instance variable as a total number of page for book.
        // Call read method. Everytime once you call the read, it will reduce the number of books 50 pages.
        // Put the if condition to check remainder of the book after reading it. If it is less than 50, print book is finished.

    }
}
