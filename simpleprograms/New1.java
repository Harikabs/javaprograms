import java.util.*;
public class New1 {
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner hh = new Scanner(System.in);
		int t = hh.nextInt();
		for(int i=0;i<t;i++){
		    int x = hh.nextInt();
		    int y = hh.nextInt();
		    if(x>=y)
		        System.out.println("yes");
		    else
		        System.out.println("no");
                hh.close();
		    
		}
	}
}

