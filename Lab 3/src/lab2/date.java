package lab2;
import java.util.Scanner;
public class date {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);


    
    int cy = sc.nextInt();
    int cm = sc.nextInt();
    int cd = sc.nextInt();
    int ch = sc.nextInt();
    int cmin = sc.nextInt();
   
   
    int ey = sc.nextInt();   
    int em = sc.nextInt();   
    int ed = sc.nextInt();    
    int eh = sc.nextInt();   
    int emin = sc.nextInt();
    sc.close();

  
    int currentTotal = (cy*365*24*60) + (cm*30*24*60)+(cd*24*60)+(ch*60)+cmin;
    int eventTotal   = (ey*365*24*60 )+(em*30*24*60)+(ed*24*60)+(eh*60) + emin;

    int diff=eventTotal-currentTotal;

    
        int days=diff/(24*60);
        int hours=(diff%(24*60))/60;
        int minutes=diff%60;

        System.out.print("\nTime remaining until event: ");
        System.out.println("\t\t" + days + " days, " + hours + " hours, and " + minutes + " minutes");
          // TODO Auto-generated method stub
    }
}

