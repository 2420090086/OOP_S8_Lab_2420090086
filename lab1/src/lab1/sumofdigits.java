package lab1;
import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		s.close();
		int sum=0;
		while(a>0) {
			sum+=a%10;
			a/=10;
		}
		System.out.print(+sum);
		
		
		// TODO Auto-generated method stub

	}

}
