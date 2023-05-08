import java.util.*;
public class In_Out {

/* Name of the class has to be "Main" only if the class is public. */
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		    int r1 = sc.nextInt();
		    int r2 = sc.nextInt();
		    int r3 = sc.nextInt();
		    int r4 = sc.nextInt();
		    if(r1==0&&r2==0&&r3==0&&r4==0)
		        System.out.println("in");
		      else
		        System.out.println("out");
                sc.close();
		}
	}


