public class MinMaxElement{
public static void main(String args[]){
int arr[]={6,9,4,5,8,1,3,2,6};
int max=arr[0];
int min=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>=max)
max=arr[i];
if(arr[i]<=min)
min=arr[i];
}
System.out.println("maximum element of array is:"+max);
System.out.println("minimum element of array is:"+min);
}
}

