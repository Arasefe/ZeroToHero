package javabuildingblocks.object;

public class SoccerPlayerTest {
    /*
   TASK
     Create one class for soccerPlayer,
     Create one class for soccerPlayerTest and create the object inside this class.
     Create 5 instance variables for soccerPlayer (Name, age,gender,position,team)
     Create three method one to run the object, second one to be shoot (Return type is speed of the shoot),
     third one to give the pass.
     */

    public static void main(String[] args) {
       SoccerPlayer player=new SoccerPlayer();
       player.name="Cristano";
       player.age=33;
       player.gender='M';
       player.team="Juventus";
       player.position="Forward";
       player.totalDistance=11;

       player.run();
       player.pass();
       int speed=player.shoot();
       int shootDistance=25;
       if (speed>=20 && shootDistance<30){
            System.out.println("It is goal");
        }else{
            System.out.println("It is not goal");
        }

       SoccerPlayer player1= new SoccerPlayer();
       player1.name="Messi";
       player1.totalDistance=8;
       player1.run();
       player1.shoot();
       player1.pass();
       player.run();

       player1.run();
       player1.run();
       player1.run();
       player1.run();


        System.out.println("Messi total distance " + player1.totalDistance);
        System.out.println(" Cristiano total distance " +player.totalDistance);
    }
}
