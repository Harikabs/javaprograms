//program for printing the intersection of the array
import java.util.Arrays;
public class Intersection{
public static void main(String args[]){
int arr1[]={2,4,7,8,5,6};
int arr2[]={5,7,8,9};
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
if(arr1[i]==arr2[j])
System.out.println(arr2[j]);
}
}
}
}
