package methodsandencapsulation.constructors;

public class AmazonTest {
    public static void main(String[] args) {
        Amazon.navigate(AmazonTestData.url);
        Amazon.login(AmazonTestData.userName,AmazonTestData.paaword);
        Amazon.search(AmazonTestData.itemName);
    }
}
