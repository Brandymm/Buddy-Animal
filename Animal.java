// Superclass (Parent Class)
class Animal {
	// Field of the superclass
	String name;
	
	// Constructor of the superclass
	public Animal(String name) {
		this.name = name;
	}
	
	// Method of the superclass 
	public void speak() {
		System.out.println("The animal makes a sound.");
	}
}


// Subclass (Child Class) inherits from Animal
class Dog extends Animal {
	// Constructor of the subclass
	public Dog(String name) {
		// Call the constructor of the superclass
		super(name);
	}
	
	// Overriding the speak method
	@Override
	public void speak() {
		System.out.println(name + " says Woof!");
	}
}