package classdesign.abstraction3;

public class Dropdown extends WebApplication{

    @Override
    public void click() {
        System.out.println("Clicking on dropdown");
        listValues();
    }

    @Override
    public void sendText() {
        System.out.println("can not send text to dropdown");
    }

    @Override
    public void dragAndDrop() {
        System.out.println("drag and drop dropdown");
    }

    public void listValues(){
        System.out.println("1.Male\n2.Female ");
    }

}
