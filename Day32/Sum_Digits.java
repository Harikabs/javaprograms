//Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
public class Sum_Digits{
public static void main(String args[]){
int n=123;
int res=fun(n);
System.out.println(res);
}
static int fun(int n){
if(n==0)
return 0;
return n%10+fun(n/10);
}
}
