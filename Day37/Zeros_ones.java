//program for printing zeros at the end 
import java.util.Arrays;
public class Zeros_ones{
public static void main(String args[]){
int arr[]={0,1,0,1,0,1,0};
int sum=0;
for (int i=0;i<arr.length;i++)
sum+=arr[i];
int zeros=arr.length-sum;
int one=sum;
int i;
for(i=0;i<zeros;i++){
arr[i]=0;
}
while(i<arr.length){
arr[i++]=1;
}
System.out.print(Arrays.toString(arr));
}
}
