package lab1;
import java.util.Scanner;
public class vowelconso {
	public static void main(String[] args) {
		
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		s.close();
		boolean a=Character.isAlphabetic(c);
		
		if(a) {
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.print("Vowel");break;
			
		default:
			System.out.print("Consonant");
						
		}
		}
		else {
			System.out.print("Enter an Alphabet");
		}
		
		
		
		
	}
	
	

}
