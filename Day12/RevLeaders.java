import java.util.*;
import java.util.Arrays;
public class RevLeaders{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array :");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array :");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int max=arr[n-1];

for (int i=n-1;i>=0;i--){
if(arr[i]>max){
max=arr[i];
System.out.println(" the leaders is:"+arr[i]+" ");
}
}
}
}


