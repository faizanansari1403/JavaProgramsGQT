//Composite object
class OS{
	private float version;
	private String name;
	
	//Using this constructor we assign the values to the object
	public OS(float version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
	//Using this we will able to get the version independently
	public float getVersion() {
		return version;
	}
	//Using this we will able to get the name independently
	public String getName() {
		return name;
	}
}

//Aggregate object
class Charger{
	private String brand;
	private int volts;
	
	//Using this constructor we assign the values to the object
	public Charger(String brand, int volts) {
		super();
		this.brand = brand;
		this.volts = volts;
	}
	//Using this we will able to get the brand independently
	public String getBrand() {
		return brand;
	}
	//Using this we will able to get the volts independently
	public int getVolts() {
		return volts;
	}
}

//Main object 
class Mobile{
	//Since OS is composite object we must create its instance inside the main object
	OS os=new OS(9.8f,"xyz");
	
	//Since charger is aggregate object we must create a method to access
	void hasACharger(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVolts());
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		Charger c=new Charger("Samsung",15);
		
		//Accessing the aggregate and composite objects
		//Using the main object
		System.out.println(m.os.getName());//xyz
		System.out.println(m.os.getVersion());//9.8
		m.hasACharger(c);//samsung,15
		
		m=null;
//		System.out.println(m.os.getName());//Exception(NullPointerException)
//		System.out.println(m.os.getVersion());
//		m.hasACharger(c);
		
		System.out.println(c.getBrand());//Samsung
		System.out.println(c.getVolts());//15

	}

}
