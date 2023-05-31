    
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


public class Water1 {


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		for(int i= 0;i<t;i++){
		    int b1 = sc.nextInt();
		    int b2 = sc.nextInt();
		    int b3 = sc.nextInt();
		    if(b1==0 && b2==1 && b3==1 ||b1==1 && b2==0 && b3==1||b1==1 && b2==1 && b3==0 || b1==1 && b2==1 && b3==1){
		        System.out.println("not now");
		    }
		    else{
		        System.out.println("water filling time");
		    }
		}
	}
}

