
public class Main {
	public static void main(String[] args) {
		//method overriding = Declaring a method in subclass,
		// 				      which is already present in parent class
		//					  donde so that a child class can give its own implementation
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.speak();
		
		animal.speak();
	}
}
