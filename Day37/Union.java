//program for printing the union of the array
import java.util.Arrays;
public class Union{
public static void main(String args[]){
int arr1[]={2,4,7,8};
int arr2[]={5,7,8,9};
int n=arr1.length+arr2.length;
int res[]=new int[n];
for(int i=0;i<arr1.length;i++)
res[i]=arr1[i];
for(int j=arr1.length,h=0;j<n;j++)
res[j]=arr2[h++];
System.out.print(Arrays.toString(res));
}
}
