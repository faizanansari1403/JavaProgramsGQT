class Plane{
	void takeOff() {
		System.out.println("Plane took-off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void lands() {
		System.out.println("Plane lands");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("CargoPlane flys at lower height");
	}
	//Specialized methods for CargoPlane...
	void carryGoods() {
		System.out.println("CargoPlane carries goods");
	}
}

class FighterPlane extends Plane{
	void fly() {
		System.out.println("FighterPlane flys at greater height");
	}
	//Specialized methods for FighterPlane...
	void carryWeapons() {
		System.out.println("FighterPlane carries weapons");
	}
}

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("PassengerPlane flys at medium height");
	}
	//Specialized methods for PassengerPlane...
	void carryPassenger() {
		System.out.println("PassengerPlane carries passengers");
	}
}
public class LaunchPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp=new CargoPlane();
		cp.takeOff(); //Parent
		cp.fly(); //Child
		cp.lands(); //Parent
		cp.carryGoods(); //Child
		System.out.println("--------------------------");
		
		FighterPlane fp=new FighterPlane();
		fp.takeOff(); //Parent
		fp.fly(); //Child
		fp.lands(); //Parent
		fp.carryWeapons(); //Child
		System.out.println("--------------------------");
		
		PassengerPlane pp=new PassengerPlane();
		pp.takeOff(); //Parent
		pp.fly(); //Child
		pp.lands(); //Parent
		pp.carryPassenger(); //Child
		System.out.println("--------------------------");
	}

}
