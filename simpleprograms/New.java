import java.util.*;
import java.lang.*;
import java.io.*;
class New{
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            double n = sc.nextInt();
		    double m = sc.nextInt();
		    double x = n-(n/10);
		    if(x>m)
		        System.out.println("dining");
		    else if(x<m)
		        System.out.println("online");
		    else
		        System.out.println("either");
                sc.close();
	}
}
