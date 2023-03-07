public class PeakElement{
public static void main(String args[]){
int arr[]={6,5,8,9,3,5};
int n=arr.length;
System.out.println(n);
if(n==0)
{
return;
}
if(n==1)
{
System.out.print(arr[0]);
}
for(int i=1;i<=n-1;i++)
{
if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1]))
{
System.out.println( arr[i]);
}
}
if(arr[ n-1]>arr[n-2])
{
System.out.println(arr[n-1]);
}
}

}


