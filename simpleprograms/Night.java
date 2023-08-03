
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Night {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		
		    int n = hh.nextInt();
		    int x = hh.nextInt();
		    if(x%n==0)
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}

