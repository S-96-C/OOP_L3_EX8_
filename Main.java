class Pet {
		private String name;
		private String owner;
		private int age;
		
		public Pet(String n, String o, int a) {
			this.name = n;
			this.owner = o;
			this.age = a;
		}
		public void showDetails(){
		System.out.println("I am a pet. My name is "+this.name+". My owner is "+this.owner+". My Age is "+this.age);
		}
	}//end of the pet class

class Cat extends Pet{
		private int livesLeft;
		public Cat(String n, String o, int a, int l) {
			super(n, o, a);
			this.livesLeft = l;
		}
	}//end of the pet class

public class Main { 
	public static void main(String[] args){ 
		Pet p = new Pet("Lissie","Smith",3); 
		p.showDetails(); 
		Cat c = new Cat("Kyan", "Silva", 4, 4); 
		c.showDetails(); 
	} 
}//end of the demo class
