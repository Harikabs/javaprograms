//program to move in a clockwise direction elements in the array
import java.util.*;
import java.util.Arrays;
public class Rotate_Elements{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
// take the length and elements of the array from th user
System.out.println("enter the length of the array :");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array :");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int temp=0;
for(int i=n-1;i>=0;i--){
int c=0;
for(int j=0;j<n;j++){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
c++;
}
System.out.println(Arrays.toString(arr));
return;
}
}
}
