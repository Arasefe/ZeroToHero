package methodsandencapsulation.constructors;

public class Sand {
    public Sand(){                  //constructor
        System.out.println("a");
    }
    public void Sand(){             //method
        System.out.println("b");
    }
    public void run(){              //method
        new Sand();
        Sand();
    }

    public static void main(String[] args) {
        new Sand().run();
    }
}
