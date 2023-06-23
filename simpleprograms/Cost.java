/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cost.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		int t = hh.nextInt();
		for(int i=0;i<t;i++){
		    int a = hh.nextInt();
		    int b = hh.nextInt();
		    int c = hh.nextInt();
		    if(a<=b && a<=c)
		        System.out.println(b+c);
		    else if(b<=c && b<=a)
		        System.out.println(a+c);
		    else
		        System.out.println(b+a);

		}    
	}
}
