import java.util.*;
public class If_Else {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh =  new Scanner(System.in);
		    int x = hh.nextInt();
		    if(x<3)
		        System.out.println("light");
		    else if(x>=3 && x<7)
		        System.out.println("moderate");
		    else
		        System.out.println("heavy");
        hh.close();        
		}
}
