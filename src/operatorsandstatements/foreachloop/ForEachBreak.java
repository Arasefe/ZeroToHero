package operatorsandstatements.foreachloop;

public class ForEachBreak {
    public static void main(String[] args) {
        java.util.List<Integer>list=new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        list.add(23);
        list.add(34);
        for(int x:list){                    // data type works as java automatically converts to wrapper Integer
            System.out.println(x + ", ");
            break;
        }
    }

}
