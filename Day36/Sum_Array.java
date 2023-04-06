//program for sum of the array
public class Sum_Array{
public static void main(String args[]){
int arr[]={3,5,6,7,8,9,2,1};
int n=arr.length-1;
int result=sumArray(arr,n);
System.out.println(result);
}
static int sumArray(int[] arr,int n){
if(n==0) 
return 0;
return arr[n]+sumArray(arr,n-1);
}
}
