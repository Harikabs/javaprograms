import java.util.*;
import java.util.Arrays;
public class CountOccur{
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
System.out.println("enter the element to count occurence in  the array :");
int k=sc.nextInt();
int occur=0;
for(int i=0;i<n;i++){
if(arr[i]==k)
   occur++;
if(arr[i]>k)
break;
}
System.out.println(" the count of the occurence in the array:"+occur);
}
}
 

