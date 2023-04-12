import java.util.*;
import java.lang.*;
import java.io.*;
class BatingRate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0;x<t;x++){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    int count=0;
		    for(int k=1;k<n;k++){
		        int sum=0;
		         if(((arr[k]+sum)/k)*100==100){
		        count++;
		         }
				
		        sum+=arr[k];
		         
		    }
		    
		    System.out.println(count);
		}
	}
}
