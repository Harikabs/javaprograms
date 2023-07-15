import java.util.*;
import java.lang.*;
public class Bus_seatnumber {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
           	int n = hh.nextInt();
		if(n<=10)
		    System.out.println("lower double");
		else if(n<=15)
		    System.out.println("lower single");
		else if(n<=25)
		    System.out.println("upper double");
		else
		    System.out.println("upper single");
        hh.close();
    }
}


