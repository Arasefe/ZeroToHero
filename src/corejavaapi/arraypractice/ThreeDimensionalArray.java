package corejavaapi.arraypractice;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        /*
        Think this is a
        Campus
        Building 1
        Offices 2
        Rooms 3 name
        Give the name to the room using below array.
        int [][][] roomNumber=new int [1][2][3];
         */
        String [][][] roomNumber=new String [][][]{{{"room1","room2","room3"},{"room1","room2","room3"}}};
//        roomNumber[0][0][0]="room11";
//        roomNumber[0][0][1]="room12";
//        roomNumber[0][0][2]="room13";
//        roomNumber[0][1][0]="room21";
//        roomNumber[0][1][1]="room22";
//        roomNumber[0][1][2]="room23";
        //for (String [][] number:roomNumber)
        for (int i=0; i<roomNumber.length;i++){
            for (int k=0;k<roomNumber[i].length;k++){
                for (int j=0; j<roomNumber[i][k].length;j++){
                    System.out.println(roomNumber[i][k][j]);
                }
            }

        }
    }
}
