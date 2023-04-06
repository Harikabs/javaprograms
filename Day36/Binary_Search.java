//program for binary search in the array
public class Binary_Search{
public static void main(String args[]){
int arr[]={1,2,3,4,5,6};
int x=5;
System.out.println(binarySearch(arr,x,0,arr.length-1));
}
static int binarySearch(int arr[],int x,int beg,int end){
if (!(beg<=end))
return -1;
int mid=(beg+end)/2;
if(arr[mid]==x)
return mid;
else{
if(arr[mid]<x)
{
beg=mid+1;
return binarySearch(arr,x,beg,end);
}
else{
beg=mid-1;
return binarySearch(arr,x,beg,end);
}
}
}
}
