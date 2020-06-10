package exceptions.creatingownexception;

public class InsufficientBalanceException extends RuntimeException{         //create our own exception Runtime Exception

public InsufficientBalanceException(){
    super();
}
public InsufficientBalanceException(String message){
    super(message);
}

}
