package methodsandencapsulation.lambdas;
@FunctionalInterface            //If you assign this you can not add any other methods
public interface PracticeInterface {
    int getSum(int num1,int num2);

    PracticeInterface practiceInterface=new PracticeInterface() {       //Anonimous class
        @Override
        public int getSum(int num1, int num2) {
            return 0;
        }
    };
}
