class Primary{
    public String name = "Deepak";
    protected int age = 18;
    // default String grade = "Bachlors";
    private int rollNo = 12;
}

class Secondry extends Primary{

}

public class accessModifiers2 {
    public static void main(String[] args) {
        
        Secondry sc = new Secondry();
        // System.out.println(sc.name);
        // System.out.println(sc.age);
        // System.out.println(sc.rollNo);
    }
}
