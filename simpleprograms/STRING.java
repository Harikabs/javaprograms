
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class STRING {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    String s = sc.next();
		    for(int j=0;j<s.length();j++){
		        	s.replace('a','t');
		        	s.replace('t','a');
		        	s.replace('c','g');
		        	s.replace('g','c');


		    	
		    System.out.println(s);
		    }
		    }
	}
}

