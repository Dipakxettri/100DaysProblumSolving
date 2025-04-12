package Day006_Opps;

class SmartPhone{
    String brand;
}

interface On{
    void on();
}

class Samsung extends SmartPhone implements On{
    public void on(){
        System.out.println("Samsung is opening");
    }
}
public class mobileInterfaces {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.on();

    }
}
