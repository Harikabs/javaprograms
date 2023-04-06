//program for printing the integer n array
import java.util.Arrays;
public class Integer_Array{
public static void main(String args[]){
int n=7;
int start=1;int i;
int res[]=new int[n];
for(i=0;i<=n/2;i++){
if((start<n)){
res[i]=start;
start+=2;
}
else
break;
}
res[i]=n;
if(n%2==0)
start=n-2;
else
start=n-1;
for(int j=i+1;j<n;j++){
res[j]=start;
start-=2;
}
System.out.print(Arrays.toString(res));
}
}
