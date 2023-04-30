// program  to check Prime number or not
import java.util.*;
public class PrimeNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbr:"); 
int n=sc.nextInt();
int m=0;
int flag=0;
m=n/2;
if(n==0||n==1){
System.out.println("it is not prime number");
}
else{
for (int i=2;i<=m;i++){
if(n%i==0){
System.out.println("it is not prime number");
flag=1;
break;
}
}
if(flag==0)
System.out.println("it is a prime number");
}
}
}


