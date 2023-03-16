//program for showing passby reference using method
import java.util.*;
public class Pass_By_Reference{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the  length of the array");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the  elements of the array");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
arraysum(arr);
}
static void arraysum(int arr1[]){
int sum=0;
for(int i=0;i<arr1.length;i++){
sum+=arr1[i];
}
System.out.print(" the sum of the array elements:"+sum);
}

}

