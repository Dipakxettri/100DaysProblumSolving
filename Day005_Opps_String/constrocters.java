package Day005_Opps_String;


class Cat{
    public String sound;


    // constrocter
    Cat(){
        System.out.println("Cat");
    }

    public void setSound(String s){
        sound = s;
    }

    public void getSound(){
    System.out.println(sound);
    }
}
public class constrocters {
    public static void main(String[] args) {
        
        Cat c = new Cat();

        c.setSound("Mew Mew");
        c.getSound();
    }
}
