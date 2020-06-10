package operatorsandstatements.switchstatement;

public class SwitchStatement6 {
    public static void main(String[] args) {
        char ch= 'b';
        int number=5;
        String animalName="Dog";

        switch (ch){
            case 'a':
                switch (number){
                    case 5:
                        System.out.println(""+ch+5);
                        break;
                    case 10:
                        System.out.println(""+ ch+10);
                        break;
                }
                break;
            case 'b':
                switch (animalName){
                    case "Dog":
                    System.out.println("Your animal kind is Dog");
                    break;
                    case "Cat":
                        System.out.println("Your animal kind is Cat");
                        break;
                }
                break;
        }
    }
}
