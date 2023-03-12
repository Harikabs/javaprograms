//program to find the lonely element in the array
import java.util.*;
public class Lonely_Element{
public static void main(String args[]){
int arr[]={4,5,6,7,6,5,4};
for(int i=0;i<arr.length;i++){
int count=0;
for(int j=0;j<arr.length;j++){
if (arr[i]==arr[j]){
count++;
}
}
if (count==1){
System.out.println(arr[i]);
return;
}
}
 }
 }

