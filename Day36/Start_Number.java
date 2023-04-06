//program to print the number from the starting
public class  Start_Number{
public static void main(String args[]){
int n=5;
startNumber(n,1);
}
static void startNumber(int n,int start){
if(start>n)
return ;
System.out.println(start+" ");
startNumber(n,start+1);
return;
}
}
