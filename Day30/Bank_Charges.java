//program for calculating bank charges using recursion
public class Bank_Charges{
public static void main(String args[]){
int n=5;
int res=charges(n);
System.out.print(res);
}
static int charges(int n){
if(n==1)
return 1;
return n+charges(n-1);
}
}

