//finding the index of the element in the array
public class Linear_Search{
public static void main(String args[]){
int arr[]={9,8,5,6,3,2,1,6};
int x=5;
int n=arr.length-1;
System.out.println(linearSearch(arr,n,x));
}
static int linearSearch(int[] arr,int n,int x){
if(arr[n]==x)
return n;
return linearSearch(arr,n-1,x);
}
}
