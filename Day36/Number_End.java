//program to print the number from the ending
public class Number_End{
public static void main(String args[]){
int n=5;
numberEnd(n);
}
static void numberEnd(int n){
if (n==0)
return ;
System.out.println(n);
numberEnd(n-1);
return;
}
}
