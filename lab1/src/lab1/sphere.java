package lab1;
import java.util.Scanner;

public class sphere {

	public static void main(String[] args) {
		
		double r;
		Scanner sll=new Scanner(System.in);
		System.out.println("Enter radius of sphere (r): ");
		r=sll.nextInt();
		sll.close();
		System.out.println("The volume of the sphere is: "+(4/3)*3.14*r*r);
			// TODO Auto-generated method stub

	}

}
