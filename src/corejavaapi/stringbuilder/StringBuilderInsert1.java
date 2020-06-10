package corejavaapi.stringbuilder;

import java.util.ArrayList;

public class StringBuilderInsert1 {
        /*
        Create one StringBuilder ArrayList with following values.
        4 elements to the ArrayList
        Actual Result
        Table
        Cup
        Phone
        Pencil
        Replace all last char with 'm'
        Create one method it will take ArrayList as a parameter and will replace all the char with 'm'
        Expected Result
        Tablm
        Cum
        Phonm
        Pencim

        ArrayList<StringBuilder> builder---> It accepts only the StringBuilder object
        ArrayList builder--->I can store any type of object.
         */
        public static void updateList(ArrayList<StringBuilder> builder){
                for (int i=0;i<builder.size();i++){
                    builder.get(i).deleteCharAt(builder.get(i).length()-1);
                    builder.get(i).insert(builder.get(i).length(),"m");

        }
    }

    public static void main(String[] args) {
        ArrayList<StringBuilder>list=new ArrayList<>();
        StringBuilder table=new StringBuilder("Table");
        StringBuilder phone=new StringBuilder("Phone");
        StringBuilder pencil=new StringBuilder("Pencil");
        list.add(table);
        list.add(new StringBuilder("Cup"));
        list.add(phone);
        list.add(pencil);
        updateList(list);



    }
}
