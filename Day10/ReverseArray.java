public class ReverseArray{
public static void main(String args[]){
int arr[]={5,7,8,2,6,3};
System.out.println("the original array:");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println(" the reversed array is");
for(int i=arr.length-1;i>=0;i--){
System.out.print(arr[i]+" ");
}
System.out.println();
}
}

