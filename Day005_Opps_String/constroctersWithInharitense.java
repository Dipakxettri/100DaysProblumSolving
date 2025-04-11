package Day005_Opps_String;

class Animal{
    Animal(){
        System.out.println("Animal Class");
    }
}

class Dog extends Animal{
    
    Dog(String name){
        System.out.println(name + " Class");
    }
}

public class constroctersWithInharitense {
    public static void main(String[] args) {

        // Animal a = new Animal();
        Dog d = new Dog("Dog");
    }
}
