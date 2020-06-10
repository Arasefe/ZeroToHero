package methodsandencapsulation.constructors;

public class BookStoreTest {
    public static void main(String[] args) {
        BookStore bookStore1=new BookStore("War and Peace","Leo Tolstoy", 20);
        bookStore1.getDetails();

        BookStore bookStore2= new BookStore("Java OCA Book", 36);
        bookStore2.getDetails();
        BookStore bookStore3=new BookStore("Selenium Book",55);
        bookStore3.getDetails();

        System.out.println(bookStore1.count);
        System.out.println(bookStore3);
        System.out.println(BookStore.count);
    }
}
