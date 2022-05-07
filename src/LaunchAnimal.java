class Animal{
	void eat() {
		System.out.println("Eating");
	}
	void breathe() {
		System.out.println("Breathing");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
}
class Cat extends Animal{
	void drink() {
		System.out.println("Cat drinks milk");
	}
	//Specialized methods for Cat...
	void run() {
		System.out.println("Cat is running by their own legs");
	}
}

class Dog extends Animal{
	void feed() {
		System.out.println("Dog eats bone");
	}
	//Specialized methods for Dog...
	void bark() {
		System.out.println("Dog is barking by their own voice");
	}
}

class Lion extends Animal{
	void think() {
		System.out.println("Lion think so quickly");
	}
	//Specialized methods for Lion...
	void see() {
		System.out.println("Lion is seeing danger");
	}
}
public class LaunchAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.eat();
		c.breathe();
		c.sleep();
		c.drink();
		c.run();
		System.out.println("-----------------------");

	}
}
