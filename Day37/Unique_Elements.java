//program for printing unique elements
public class Unique_Elements{
public static void main(String args[]){
int arr[]={2,4,5,6,6,8,3,2};
for (int i=0;i<arr.length;i++){
int j;
for(j=0;j<arr.length;j++){
if(i!=j){
if(arr[i]==arr[j])
break;
}
}
if(j==arr.length){
System.out.print(arr[i]);
}
}
}
}
