package methodsandencapsulation.constructors;

public class BookStore {
    public String title;                // public instance variable can be accessed from other packages
    String author;
    public int price;
    static int count;       // There will be one copy for all objects.
    public BookStore(String title,int price){
        this.title=title;
        this.price=price;
        count++;

    }
    public BookStore (String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
        count++;
    }

    public void getDetails(){
        // war and Peace, Leo Tolstoy, $20
        System.out.println(title+", "+author+", $"+price);
    }

}
