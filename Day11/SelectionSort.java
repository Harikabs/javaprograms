import java.util.*;
import java.util.Arrays;
public class SelectionSort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements of the array");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n;i++){
int small=arr[i];
for(int j=i+1;j<n;j++){
if(arr[j]<small)
small=arr[j];
}

int temp=arr[i];
arr[i]=small;
small=temp;
}
System.out.println(Arrays.toString(arr));

}
}


