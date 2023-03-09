import java.util.*;
import java.util.Arrays;
public class Leaders{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//System.out.println("enter the length of the array :");
//int n=sc.nextInt();
//int arr[]=new int[n];
//System.out.println("enter the elements of the array :");
//for(int i=0;i<n;i++)
//arr[i]=sc.nextInt();
int arr[]={3,5,6,7,4,9};
int n=arr.length;
for (int i=0;i<n;i++){
int c=0;
for(int j=i+1;j<=n-1;j++){
if(arr[i]<arr[j])
c++;
break;
}
if(c==0)
System.out.println(" the leader is:"+arr[i]+" ");

}
}
}

