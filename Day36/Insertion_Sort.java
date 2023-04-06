//program for inserstion sort alogorithm
import java.util.Arrays;
public class Insertion_Sort{
public static void main(String args[]){
int[] arr={2,8,6,4,3,2,9};
int n=arr.length;
for(int i=1;i<n;i++){
int key=arr[i];
int j=i-1;
while(j>=0&& arr[j]>key){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=key;
}
System.out.print(Arrays.toString(arr));
}
}
