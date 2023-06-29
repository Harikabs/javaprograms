import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
public class Bullet {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		    int x = hh.nextInt();
		    int y = hh.nextInt();
		    int z = hh.nextInt();
		    if((z-(y/x))<=0)
		        System.out.println(0);
		    else
		        System.out.println(z-(y/x));
                hh.close();
		}

}
