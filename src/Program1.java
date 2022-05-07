
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RajaRamMohanRoy";
		System.out.println("The main string is:"+s1);
		String res1=s1.toUpperCase();
		System.out.println("toUpperCase result:"+res1);
		String res2=s1.toLowerCase();
		System.out.println("toLowerCase result:"+res2);
		boolean res3=s1.startsWith("Raja");
		System.out.println("startsWith result:"+res3);
		boolean res4=s1.startsWith("Roja");
		System.out.println("startsWith result:"+res4);
		boolean res5=s1.endsWith("Roy");
		System.out.println("endsWith result:"+res5);
		boolean res6=s1.endsWith("Boy");
		System.out.println("endsWith result:"+res6);
		

	}

}
