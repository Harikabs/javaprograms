//program for equilibreium of the array
public class Array{
public static void main(String args[]){
int arr[]={1,6,3,3,4};
int n=arr.length;
for(int i=0;i<n;i++){
int lsum=0;
int rsum=0;
for(int j=0;j<i;j++)
lsum+=arr[j];
for(int j=i+1;j<n;j++)
rsum+=arr[j];
if(lsum==rsum){
System.out.println(i);
return ;
}
}
}
}
