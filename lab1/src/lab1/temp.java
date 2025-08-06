package lab1;
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		
		double r;
		Scanner sll=new Scanner(System.in);
		System.out.print("Enter Celsius: ");
		r=sll.nextInt();
		sll.close();
		System.out.println("The Fahrenheit equivalent is: "+((9/5)*r+32));
		

	}

}
