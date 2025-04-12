package Day006_Opps;

class Animal {
	public String sound;
	public String food;
	public String home;
	
	
		
	public void setSound(String s){
		sound = s;
		}
		
				
	public void getSound(){
			System.out.println(sound);
			}
			
	public void setFood(String f){
		food = f;
		}
		
		public void getFood(){
			System.out.println(food);
			}
		public void setHome(String h){
			home = h;
			}
		
	public void getHome(){
		System.out.print(home);
		}
	}

class Cat extends Animal{
		Cat(String n){
			System.out.println(n);
			}
		
		}
public class animalClass {
    public static void main(String[] args) {
		Cat c = new Cat("Cat");
		c.setSound("Mew Mew");
		c.getSound();
		c.setFood("Fish");
		c.getFood();
		c.setHome("Domestic");
		c.getHome();
		
	}
}