
// program to find the  bubblesorting of the array
import java.util.*;
import java.util.Arrays;
public class Bubble_Sort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}

System.out.println("The  sorted array is:"+Arrays.toString(arr));
}
}



 
