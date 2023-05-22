import java.util.*;
public class Program {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
	    int t = hh.nextInt();
	    for(int i= 0;i<t;i++){
	        int x = hh.nextInt();
	        int y =hh.nextInt();
	        int z =hh.nextInt();
	        
	         if(x%3==0)
	           System.out.println((x*y)+(z*((x/3)-1)));
		    
		    else
		        System.out.println((x*y)+(z*(x/3)));
		    
	        
	    }
        hh.close();
	}
}

