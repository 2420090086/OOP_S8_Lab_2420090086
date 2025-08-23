package inheritance;

class output{
	void ticketPrice() {
		  System.out.println("Ticket Price: ");
	  }
}


class Bus extends output{
	void ticketPrice() {
	System.out.println("Bus Price is 50 ");
	}
}

class Train extends output{
	void ticketPrice() {
		System.out.println("Train Price is 70 ");
		}
}

public class transport {
	public static void main (String args[]) {
		
		output ticket1= new Bus();
		output ticket2= new Train();
		
		ticket1.ticketPrice();
		ticket2.ticketPrice();
		
		
	}
  
}
