class Calculator{
	//1
	int add(int a,int b) {
		System.out.println("Inside int,int");
		return a+b;
	}
	//2
	int add(int a,int b, int c) {
		System.out.println("Inside int,int,int");
		return a+b+c;
	}
	//3
	float add(float a,float b) {
		System.out.println("Inside float,float");
		return a+b;
	}
	//4
	float add(float a,float b,float c) {
		System.out.println("Inside float,float,float");
		return a+b+c;
	}
	//5
	double add(double a,double b) {
		System.out.println("Inside double,double");
		return a+b;
	}
	//6
	double add(double a,double b,double c) {
		System.out.println("Inside double,double,double");
		return a+b+c;
	}
	//7
	float add(int a,float b) {
		System.out.println("Inside int,float");
		return a+b;
	}
	//8
	double add(int a,double b) {
		System.out.println("Inside int,double");
		return a+b;
	}
	//9
	double add(float a,double b) {
		System.out.println("Inside float,double");
		return a+b;
	}
	//10
	double add(double a,float b) {
		System.out.println("Inside double,float");
		return a+b;
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		int a=10,b=30,c=30;
		float m=23.45f,n=121.11f,o=354.6f;
		double p=234.567, q=1112.234, r=989.786;
		
		System.out.println(c1.add(a, b)); //int,int 
		System.out.println(c1.add(m, n)); //float,float
		System.out.println(c1.add(p, q)); //double,double
		System.out.println(c1.add(p, n)); //double,float
		
		
	}

}
