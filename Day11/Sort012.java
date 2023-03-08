//program to sort the array that having 1's ,0's,2's
import java.util.Arrays;
public class Sort012{
public static void main(String args[]){
int arr[]={1,0,2,0,1,2,2,1,0,0,2,1,1,2};
int zeros=0,ones=0,twos=0;
for(int i =0;i<arr.length;i++){
if (arr[i]==0)
zeros++;
if (arr[i]==1)
ones++;
if(arr[i]==2)
twos++;
}
for(int i=0;i<zeros;i++)
arr[i]=0;
for(int i=zeros;i<zeros+ones;i++)
arr[i]=1;
for(int i=ones+zeros;i<arr.length;i++)
arr[i]=2;

System.out.println(Arrays.toString(arr));
}
}

