package operatorsandstatements.optionallabel;

public class OptionalLabelBreak {
    public void optionalMethod(){
        int [][]list={{1,13,5},{1,2,5},{2,7,2}};
        int searchValue=2;
        int positionX=-1;
        int positionY=-1;

       PARENT_LOOP: for(int i=0;i<list.length;i++){
            for (int j=0;j<list[i].length;j++){
                if (list[i][j]==searchValue){
                    positionX=i;
                    positionY=j;
                    break PARENT_LOOP;
                }
            }
        }if(positionX==-1||positionY==-1) {
            System.out.println("Value" + searchValue + "not found");
        }else{
            System.out.println("Value"+ searchValue+"found at : "+"("+positionX+","+positionY+")");

        }
    }

    public static void main(String[] args) {
        OptionalLabelBreak lb=new OptionalLabelBreak();         //TO CALL A NON STATIC METHOD WE HAVE TO CREATE AN OBJECT
        lb.optionalMethod();

    }
}
