
import java.util.Scanner;
public class LetterPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for(int i=0;i<25;i++) {
			 for(int j=0;j<25;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}
