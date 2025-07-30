package lab1;
import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		s.close();
		boolean a=Character.isAlphabetic(c);
		if(a==true) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");

		}
		
		
		// TODO Auto-generated method stub

	}

}
