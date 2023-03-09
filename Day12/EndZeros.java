import java.util.*;
import java.util.Arrays;
public class EndZeros{
public static void main(String args[]){

int arr[]={5,4,0,9,0,8,0,6,0,4};
int n=arr.length;
int arr2[]=new int[n];
int j=0;
for(int i=0;i<n;i++){
if(arr[i]!=0)
arr2[j++]=arr[i];
}
while(j<arr2.length){
arr2[j++]=0;
}
System.out.println(Arrays.toString(arr2));
}
}
