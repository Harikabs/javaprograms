    /* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
public class AC {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);                           
		int t = hh.nextInt();
		for(int i=0;i<t;i++){
		    int p = hh.nextInt();
		    if(((p/100)+(p%100))<=10)
		        System.out.println((p/100)+(p%100));
		    else
		        System.out.println(-1);
		}

	}
}

