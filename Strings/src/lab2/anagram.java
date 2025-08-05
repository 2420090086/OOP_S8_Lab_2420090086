package lab2;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String a1=s.next();
		int a=a1.length();
		String a2=s.next();
		int b=a2.length();
		s.close();
		char d,e;
		int c=0;
		
		if(a!=b) {
			System.out.print("Not Anagrams");
		}
		else {			
			for(int i=0;i<a;i++) {
				d=a1.charAt(i);
				for(int j=0;j<a;j++) {
					e=a2.charAt(j);
					if(d==e) {
						c++;
					}
					
				}
			}
			
		}
		if(c==a) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not Anagram");
		}
		// TODO Auto-generated method stub

	}

}
