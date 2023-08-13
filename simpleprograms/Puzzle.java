import java.util.*;
import java.lang.*;
import java.io.*;
class Puzzle{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner hh = new Scanner(System.in);
		int n = hh.nextInt();
		if(n>=6 && n<=8)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
