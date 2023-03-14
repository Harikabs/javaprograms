//program to find the checksumpairs in the array
import java.util.*;
public class Check_Sum_Pairs{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// take the input length and elements of the array
System.out.println("enter the  length of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("enter the number to check the sum:");
int x=sc.nextInt();
for(int i=0;i<n-1;i++){
for(int j=1;j<n;j++)
if (arr[i]+arr[j]==x)
{
System.out.println( "the indexes are("+i+","+j+")");
return;
}

}
}
}


