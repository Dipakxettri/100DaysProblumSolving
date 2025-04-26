

import java.util.Scanner;

// This Keyboard :
class First{
    public String name = "Deepak";
    public int age = 18;

    public void setName(String name){
        this.name = name;
    }
}


// This Keyboard :
class Base {
    Base(String name){
        System.out.println("Base Class");
    }
}

class Derive extends Base{

    
    // Derive(){
    //     System.out.println("Dervived Class");
    // }
}

// Super Keyboard:



public class thisAndSuperKey {
    public static void main(String[] args) {
        
        First f = new First();

        // f.setName(null);

        // Base b = new Base();
        Derive d = new Derive();
    }
}
