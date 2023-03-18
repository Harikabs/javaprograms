// program to adding two equal length arrays
public class AddArrays{
public static void main(String args[]){
int a[]={3,5,6};
int b[]={7,8,9,8};
int sum=0;
for(int i=0,j=0;i<a.length && j<b.length;i++,j++){
sum+=a[i]+b[j];
}
while(i<a.length)
{
sum+=a[i++];
}
while(j<b.length)
{
sum+=b[j++];
}
System.out.println(sum);
}
}
