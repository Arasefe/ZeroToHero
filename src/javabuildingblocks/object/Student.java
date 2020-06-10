package javabuildingblocks.object;

public class Student {
    String firstName;
    String lastName;
    int age;
    char gender;
    String nationality;
    int totalPages;
    //public is access modifier
    // void is return type. If returning nothing, void return type is used.
    // Method signature=name of the method + parameter
    public void study(String day){
        System.out.println("The student is studying"+ day );
    }
    public int studyTime(){
        int hour=10;
        System.out.println("The student is studying "+ hour+ "hours");
        return hour;
    }

    public void read() {
        if (totalPages>=50) {
            System.out.println(firstName + " is reading");
            totalPages = totalPages - 50;
        }else{
            System.out.println(firstName+ "has finished reading the book.");
            totalPages-=totalPages;

            System.out.println();
        }
        System.out.println("The student is reading");
    }
        public static void main(String[] args) {
        Student std=new Student();
        std.firstName="Aras Efe";
        std.lastName="YILDIRIM";
        std.age=5;
        std.gender='M';
        std.nationality="USA";
        std.totalPages=200;

        System.out.println("The first name is "+ std.firstName);
        System.out.println("The last name is "+ std.lastName);
        System.out.println("The age is "+ std.age);
        System.out.println("The gender is "+ std.gender);
        System.out.println("The nationality is "+ std.nationality);
        System.out.println("The pages are "+ std.totalPages);


        // TASK
        // Create another student and give your information and print them all
            std.read();
            int shour=std.studyTime();
            System.out.println("The student studies " + (shour*60)+ "minutes");


        Student std2=new Student();
        std2.firstName="Mahmut";
        std2.lastName="Erbiz";
        std2.age=23;
        std2.gender='M';
        std2.nationality="USA";

        System.out.println("The first name is "+ std2.firstName);
        System.out.println("The last name is "+ std2.lastName);
        System.out.println("The age is "+ std2.age);
        System.out.println("The gender is "+ std2.gender);
        System.out.println("The nationality is "+ std2.nationality);


        }
}

    // TASK inside student class create one method to be able to read.
    // Call this method inside the student class and if you created studenttest class call in that class as well.

    // TASK
    // Create one class for soccerPlayer
    // Create 5 instance variables for soccerPlayer (Name, age,gender,position,team)
    // Create three method one to run the object, second one to be shoot, third one to give the pass