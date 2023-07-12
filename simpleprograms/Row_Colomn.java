import java.util.*;
import java.lang.*;
import java.io.*;
public class Row_Colomn {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int s1=sc.nextInt();
		    int s2=sc.nextInt();
		    int e1=sc.nextInt();
		    int e2=sc.nextInt();
		    if(s1!=e1&&s2!=e2)
		    System.out.println("1");
		    else
		    System.out.println("2");
		}
	}
}
