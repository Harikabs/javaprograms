import java.util.*;
import java.lang.*;
import java.io.*;

public class Gift {


/* Name of the class has to be "Main" only if the class is public. */
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		int x = hh.nextInt();
		int n = hh.nextInt();
		int m = hh.nextInt();
		if(x+m>=n)
		    System.out.println("yes");
		else
		    System.out.println("no");
			}
}

