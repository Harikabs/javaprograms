//program for returning the length of the number using recursion
public class Number_length{
public static void main(String args[]){
int n=123456;
System.out.println(len(n));
}
static int len(int n){
if(n==0)
return 0;
return 1+len(n/10);
}
}
