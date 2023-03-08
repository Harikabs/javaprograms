import java.util.*;
import java.util.Arrays;
public class KthElement{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array :");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array :");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

Arrays.sort(arr);
System.out.println("the array is");
for(int i=0;i<n;i++)
System.out.println(arr[i]);
System.out.println("enter the k th element :");
int k=sc.nextInt();
System.out.println("the kth largest number is"+arr[n-k]);
System.out.println("the kth smallest number is"+arr[k-1]);
}
}

