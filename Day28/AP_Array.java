//program for finding the given array is in  ap or not
import java.util.Arrays;
public class AP_Array{
public static void main(String args[]){
int arr[]={0,4,8,12};
Arrays.sort(arr);
int dif=arr[0]-arr[1];
for(int i=0;i<arr.length-1;i++){
if(arr[i]-arr[i+1]==dif){
System.out.println("  in ap");
return;
}
}
System.out.println("not in ap");
}
}

