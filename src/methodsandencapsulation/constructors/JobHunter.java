package methodsandencapsulation.constructors;

public class JobHunter {
    public static void main(String[] args) {
        Job job1=new Job();
        Job job2=new Job("SDET",100000,"Chicago");

        String job2Title=job2.jobTitle;
        String job1Title=job1.jobTitle;

        System.out.println(job1.country);
        System.out.println(job2.country);
        System.out.println(job2Title);
        System.out.println(job1Title);

        job1.country="Poland";

        System.out.println(job1.country);
        System.out.println(job2.country);

        job2.getDetails();

        }

    }

