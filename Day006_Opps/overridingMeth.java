package Day006_Opps;

class BaseClass{

    // original belongs to base class
    public void func(){
        System.out.println("Base Class func");
    }
}

class ChildClass extends BaseClass{

    // after override 
    @Override  
    public void func(){
        System.out.println("Child class func");
    }
}
public class overridingMeth {
    public static void main(String[] args) {
        ChildClass bc = new ChildClass();

        bc.func();

    }
}
