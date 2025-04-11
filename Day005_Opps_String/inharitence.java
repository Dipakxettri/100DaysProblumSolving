package Day005_Opps_String;

class Parent {
    public String name = "Deepak";
    public int id = 2;

    public void getName(){
        System.out.println(name);
    }

    public void getId(){
        System.out.println(id);
    }
}

class Child extends Parent{

}
public class inharitence {
    public static void main(String[] args) {
        Child c = new Child();
        c.getName();
        c.getId();


    }
}
