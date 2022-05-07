class Faiz{
	String name;
	int cost;
	String color;
	static int no_of_legs;//static variable
	
	//static block
	static {
		no_of_legs=4;
	}
	
}
public class StaticExample1 {
	public static void main(String[] args) {
		Faiz d1 = new Faiz();
		d1.name="nakv";
		d1.cost=3000;
		d1.color="black";
		
		System.out.println(d1.name);
		System.out.println(d1.cost);
		System.out.println(d1.color);
		System.out.println(d1.no_of_legs);
		System.out.println("------------");
		
		Faiz d2 = new Faiz();
		d2.name="fvdssd";
		d2.cost=2000;
		d2.color="blue";
		System.out.println(d2.name);
		System.out.println(d2.cost);
		System.out.println(d2.color);
		System.out.println(d2.no_of_legs);
		System.out.println("------------");
		
		
		Faiz d3 = new Faiz();
		d3.name="qweq";
		d3.cost=5000;
		d3.color="white";
		System.out.println(d3.name);
		System.out.println(d3.cost);
		System.out.println(d3.color);
		System.out.println(d3.no_of_legs);
		System.out.println("------------");
	}
}