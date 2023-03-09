import java.util.*;
import java.util.Arrays;
public class LargestThree{
public static void main(String args[]){
/*Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array :");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array :");
for(int i=0;i<n;i++)
int arr[i]=sc.nextInt();*/
int arr[]={8,32,69,8,6,2,32};
int n=arr.length;
int max1=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
int max3=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
if(arr[i]>max1){
max3=max2;
max2=max1;
max1=arr[i];
}
if(arr[i]>max2 &&arr[i]!=max1){
max3=max2;
max2=arr[i];
}
if(arr[i]>max3 && arr[i]<max1 && arr[i]<max2){
max3=arr[i];
}
}
System.out.print(max1+ " "+max2+ " "+max3);

}
}

