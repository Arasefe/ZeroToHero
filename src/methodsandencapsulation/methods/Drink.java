package methodsandencapsulation.methods;

public class Drink {
    public static void water(){}
        public void get(){
            water();
            Drink.water();
            this.water();
        }

    }

