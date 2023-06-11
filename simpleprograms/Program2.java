    
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
public class Program2 {

/* Name of the class has to be "Main" only if the class is public. */

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		int t = hh.nextInt();
		for(int i=0;i<t;i++){
		    int n = hh.nextInt();
		    int x = hh.nextInt();
		    String z = String.valueOf(n*x);
		    if((z.length()==5 )&&(z.charAt(0)!=0))
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}