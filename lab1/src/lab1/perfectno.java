package lab1;
import java.util.Scanner;

public class perfectno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		int sum=0;
		n=s.nextInt();
		s.close();
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
			sum+=i;
			}
			
		}
		if(sum==n) {
			System.out.print("Perfect Number");
		}
		else {
			System.out.print("Not Perfect Number");

		}
		
		// TODO Auto-generated method stub

	}

}
