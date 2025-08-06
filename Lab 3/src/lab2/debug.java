package lab2;

public class debug {
	    public static void main(String[] args) {
	        String name = "  rAjEsh ";
	        
	        String Trimmed=name.trim();
	         Trimmed = Trimmed.toLowerCase();
	         Trimmed = Trimmed.replace("a", "@");
	        System.out.println("Formatted Name: " + Trimmed);
	    }
	

}
