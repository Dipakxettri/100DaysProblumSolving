package Day006_Opps;
abstract class Animal{
    public String sound;

    abstract void makeSound(String s);
}

class Dog extends Animal{

    Dog(){
        System.out.println("Dog");
    }

    void makeSound(String s){
    sound = s;
    System.out.println(sound);
    }
}

public class astractAnimal {
    public static void main(String[] args) {
        Dog dg = new Dog();

        dg.makeSound("Hau Hau");
    }
}
