// program to implement Binary search
import java.util.*;
import java.util.Arrays;
public class Binary_Search{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// take the input length and elements of the array
System.out.println("enter the  length of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array:");

for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

System.out.println("enter the element to find  in the array:");
int x=sc.nextInt();
Arrays.sort(arr);
System.out.println("the sorted array is:"+Arrays.toString(arr));
int first=0;
int last=n-1;
int mid=(first+last)/2;

while(first<=last){
if(arr[mid]<x)
first=mid+1;
else if(arr[mid]==x){
System.out.println(x+" is found at location or index:"+(mid+1));
break;
}
else
{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last)
System.out.println(x+"is not found");
}
}



