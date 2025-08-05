package lab2;

import java.util.Scanner;

public class repeatingstring {
	
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String a1=s.next();

		int a=a1.length();
		s.close();
		
		char d,e;
		int c;		
		
		for(int i=0;i<a;i++) {
			d=a1.charAt(i);
		  c=0;
		for(int j=0;j<a;j++) {
			e=a1.charAt(j);
			
			if(d==e&&i!=j) {
				c=1;
				break;
			}
			
		}
		if(c==0) {
			System.out.print(d);
			break;
		}
		
		
}
// TODO Auto-generated method stub

}
}


