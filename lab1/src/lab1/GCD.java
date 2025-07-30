package lab1;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		
		long a,b,gcd=0;
		Scanner s= new Scanner(System.in);
		a=s.nextLong();
		b=s.nextLong();
		s.close();
		if(a%b==0||b%a==0) {
			if(a>b) {
				System.out.print(+b);
			}
			else {
				System.out.print(+a);

			}
		}
		else if(a==b) {
			System.out.print(+b);

		}
		else {
			if(a>b) {
				for(int i=1;i<=b/2;i++) {
					if(a%i==0&&b%i==0) {
						gcd=i;
					}
				}
			}
			else {
				for(int i=1;i<=a/2;i++) {
					if(a%i==0&&b%i==0) {
						gcd=i;
					}
				}

				
			}
			System.out.print(+gcd);

		}

		
		
		
		
	}

}
