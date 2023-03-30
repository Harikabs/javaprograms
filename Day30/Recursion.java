//program for implementing recursion
public class Recursion{
public static void main(String args[]){
int n=5;
fun(n);
System.out.println("done");
return;
}
static int fun(int n){
if(n==1)
return 1;
System.out.print(n);
fun(n-1);
return ;

}
}
