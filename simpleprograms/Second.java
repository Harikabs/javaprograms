    /* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Second {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		
		    int arr[] = new int[3];
            for(int j=0;j<arr.length;j++){
		     arr[j]= hh.nextInt();
            }
		    Arrays.sort(arr);
		    System.out.println(arr[1]);
            hh.close();
		}
	}


