package classdesign.abstraction3;

public class User {
    public static void main(String[] args) {
        CheckBox checkBox=new CheckBox();
        checkBox.dragAndDrop();
        checkBox.click();

        Dropdown dropdown=new Dropdown();
        dropdown.click();
    }
}
