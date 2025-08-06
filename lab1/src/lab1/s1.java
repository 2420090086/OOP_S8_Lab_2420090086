package lab1;
import java.util.Scanner;
class s1
{
public static void main(String[] args)
{
	String c;
	
	do {
	Scanner sll=new Scanner(System.in);
	System.out.println("***Calculator***");
	System.out.println("Enter choice:");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Division");
	System.out.println("4.Multiplication");
	System.out.println("5.Modulus");
	System.out.println("6.Exit");
	c= sll.nextLine();
	sll.close();
	if(!c.equals("6")){
	operation(c);
	}
	
	}
	
	 while (!c.equals("6"));
}




static void operation(String op ) {
	
	Scanner sc=new Scanner(System.in);

	
	System.out.print("Enter No.1: ");
	int a=sc.nextInt();
	System.out.print("Enter No.2: ");
	int b=sc.nextInt();
	sc.close();
	
	int c;
	switch(op) {

	case "1":
		c=a+b;
		System.out.println("Your Answer is:"+c);break;
	case "2":
		c=a-b;
		System.out.println("Your Answer is:"+c);break;	
	case "3":
		c=a/b;
		System.out.println("Your Answer is:"+c);break;	
	case "4":
		c=a*b;
		System.out.println("Your Answer is:"+c);break;		
	case "5":
		c=a%b;
		System.out.println("Your Answer is:"+c);break;		

	
}
	
	
	}
}



