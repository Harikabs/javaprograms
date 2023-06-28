import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Program1 {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner  hh = new Scanner(System.in);
		int t =  hh.nextInt();
		for(int i =0;i<t;i++){
		    int x = hh.nextInt();
		    int y =x/10;
		    if((y+y%5)==0)
		        System.out.println(y+y%5);
		    else
		        System.out.println(-1)		    
		}
	}
}








