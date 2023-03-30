//program for calculating  sum of n natural numbers using recursion
public class Sum_Numbers{
public static void main(String args[]){
int n=10;
int res=sum(n);
System.out.println(res);
}
static int sum(int n){
if(n!=0)
return n+sum(n-1);
else
return n;
}
}
