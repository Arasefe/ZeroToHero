    package operatorsandstatements.conditionstatements;

    import java.util.Scanner;

    public class NestedIfStatement {
        /*
        To be able to do master
        i need Bachelor Degree
        i need GPA more than 3
         */
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Do you want to pursue bachelor degree?");
            String bechelorDegree=input.nextLine();

            if (bechelorDegree.equalsIgnoreCase("yes")){
                System.out.println("What is your GPA SCORE?");
                double gpa=input.nextInt();
                if (gpa>=3){
                    System.out.println("You were accepted to master degree");
                }
                else {
                    System.out.println("You need to increase your GPA score");
                }
            }
            else {
                System.out.println("You need a bachelor degree");
            }

        }
    }
