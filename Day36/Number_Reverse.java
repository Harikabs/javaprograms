//program to print the  reverse of a number 
public class Number_Reverse{
public static void main(String args[]){
int n=553278;
numberReverse(n);
}
static void numberReverse(int n){
if(n==0)
return ;
System.out.print(n%10);
numberReverse(n/10);
return;
}
}
