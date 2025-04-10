package Day004_Array_Opps;

class CellPhone{
    
    public void ringing(){
        System.out.println("Phone is ringing");
    }

    public void vibrating(){
        System.out.println("Phone is Vebriting");
    }
}
public class opps1 {
    public static void main(String[] args) {
        
        CellPhone cp = new CellPhone();

        cp.ringing();
        cp.vibrating();
    }
}
