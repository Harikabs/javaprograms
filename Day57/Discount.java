import java.util.*;
public class Discount {
    

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner  hh = new Scanner(System.in);
		
		    int  x = hh.nextInt();
		    if( x/10 >100)
		       System.out.println(x/10);
		    else 
		       System.out.println(100);
               hh.close();
		}
	}
