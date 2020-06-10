package javabuildingblocks.object;

public class SoccerPlayer {
    /*
    TASK
     Create one class for soccerPlayer,
     Create one class for soccerPlayerTest and create the object inside this class.
     Create 5 instance variables for soccerPlayer (Name, age,gender,position,team)
     Create three method one to run the object, second one to be shoot (Return type is speed of the shoot),
     third one to give the pass
     */
    String name;
    int age;
    char gender;
    String position;
    String team;
    int totalDistance;

    public void run(){

        if (totalDistance>=3){
            System.out.println(name + "is running");
            totalDistance=totalDistance-3;

        }
        else if (totalDistance<3 && totalDistance>0) {
            System.out.println(name = "is running slowly");
        } else{
            System.out.println(name + "can not run anymore");
        }
    }
    public int shoot(){
        int shootSpeed=35;
        System.out.println("The player is shooting. The speed is " + shootSpeed);
        return shootSpeed;
    }
    public void pass(){
        System.out.println("The Player is passing.");
    }


}
