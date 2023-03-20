//program to add two arrays  
import java.util.Arrays;
public class Sum_Array{
public static void main(String args[]){
int a[]={6,6,7,9,3,5,7};
int b[]={7,8,9,5,4,2};
int max=a.length>b.length?a.length:b.length;
max-=1;
int c[]=new int[max+1];
int i=a.length-1;
int j=b.length-1;
int k=0; int z=1;
int sum=0;
while(i>=0&&j>=0){
sum=a[i]+b[j]+k;
c[max]=sum%10;
k=sum/10;
max--;
i--;
j--;
if(a.length==b.length){
System.out.println(Arrays.toString(c));
return;
}
else if(a.length>b.length){
while(i>=0){
sum=a[i]+k;
c[max--]=sum%10;
k=sum/10;
i--;
}
}
else{
while(j>=0){
sum=a[j]+k;
c[max--]=sum%10;
k=sum/10;
j--;
}
}
System.out.println(Arrays.toString(c));
}
}
}

