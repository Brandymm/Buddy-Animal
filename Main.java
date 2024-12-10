
public class Main {

	public static void main(String[] args) {
		// Create an object of the subclass
		Dog dog = new Dog("Buddy");
		
		// Call the method from the superclass, but overridden in the subclass
		dog.speak(); // Output: Buddy says Woof!

	}

}
