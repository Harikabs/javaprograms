import java.util.*;
public class NumberAndSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int sum=0;
System.out.println("the n numbers are:");
for (int i=1;i<=n;i++){
System.out.println(i);
sum=sum+i;
}
System.out.println("the sum of the n numbers is:"+sum);
}
}
