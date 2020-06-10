    package operatorsandstatements.conditionstatements;

    import java.util.Scanner;

    public class IfStatementJavaSelenium {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Do you know JAVA?");
            String javaStatus=input.nextLine();

            if (javaStatus.equalsIgnoreCase("YES")) {
                System.out.println("Do you know Selenium?");
            }
            else {
                System.out.println("We do need a person who knows JAVA");
            }
                 String sleniumStatus=input.nextLine();
                     if (sleniumStatus.equalsIgnoreCase("Yes")) {
                         System.out.println("Do you know API Testing?");
                         }
                     else {
                         System.out.println("You need to learn selenium");
                          }
                             String apiStatus=input.nextLine();
                             if (apiStatus.equalsIgnoreCase("Yes")){
                                 System.out.println("You are hired");
                                }
                             else {
                                 System.out.println("You need to learn API testing");
                                }

        }
    }

