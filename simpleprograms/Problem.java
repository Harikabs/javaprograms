public class Problem {
    
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		int t = hh.nextInt();
		for(int i=0;i<t;i++){
		    int n = hh.nextInt();
		    int m = hh.nextInt();
		    if(n==m){
		        System.out.println("yes");
		    }else {
		    if(n>m){
		            n=n-1;
		            m=m+1;
		        }
		    else{
		        n=n+3;
		        m=m-1;
		            
		        }
		        if(n==m)
		            System.out.println("yes");
		        else
		            System.out.println("no");
		    }
		    
		}
	}
}

