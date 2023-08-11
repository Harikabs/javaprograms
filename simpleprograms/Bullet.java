import java.util.*;
public class Bullet {
	public static void main (String[] args) throws java.lang.Exception
	{
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
