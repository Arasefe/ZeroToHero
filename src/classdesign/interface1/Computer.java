package classdesign.interface1;

public abstract class Computer implements Keyboard,Mouse,Screen {      //Interface can inherit multiple

    final  int MEMORY=40;

    public abstract boolean isOnSell();                                 //abstract method



}
