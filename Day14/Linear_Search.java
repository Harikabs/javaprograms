// program to implement linear search
import java.util.*;
public class Linear_Search{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// take the input length and elements of the array
System.out.println("enter the  length of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array:");

for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

System.out.println("enter the number u want to search for:");
int a=sc.nextInt();
for(int i=0;i<n;i++){
if(arr[i]==a)
System.out.println(i);
}
}
}

