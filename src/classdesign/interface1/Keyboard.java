package classdesign.interface1;

public interface Keyboard {
    int BUTTONS=101;                // Interface variables by default are public, static, final
    boolean ISBLUETOOOTH=true;
    void type ();                   // Interface methods by default public, abstract and no body as in abstract method

    int batteryLife();
}
