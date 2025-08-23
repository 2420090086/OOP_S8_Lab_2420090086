package inheritance;



class Order{
	
	void printDetails() {
		System.out.println("Order Information");
	}
}

class Onlineorder extends Order{
	
	void printDetails() {
		super.printDetails();
		System.out.println("Delivery Information");
		
	}
}

public class Ecommerce {

	public static void main(String[] args) {
		
		Order info = new Onlineorder();
		info.printDetails();
		
		
		// TODO Auto-generated method stub

	}

}
