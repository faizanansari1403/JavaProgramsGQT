class Parent{
	String name;
	int age;
	
	void eat() {
		System.out.println("Eating");
	}
}
class Child extends Parent{
	
}
public class SimpleInheritanceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.name="Faizan";
		c.age=21;
		System.out.println(c.name+" "+c.age);
		c.eat();

	}
}

