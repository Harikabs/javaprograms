import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
public class Speed_Limit {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner  hh = new Scanner(System.in);
		    float a = hh.nextInt();
		    float x = hh.nextInt();
		    float b = hh.nextInt();
		    float y = hh.nextInt();
		    if((a/x)>(b/y)){
		        System.out.println("Alice");
		    }
		    else if((a/x)<(b/y)){
		        System.out.println("Bob");
		    }
		    else {
		        System.out.println("Equal");
		    }
            hh.close();
		}
		    
	}
