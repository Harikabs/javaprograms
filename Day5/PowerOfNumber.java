import java.util.*;
public class PowerOfNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the  first number:");
int a=sc.nextInt();
System.out.println("enter the second number:");
int b=sc.nextInt();
int result=1;
for(int i=1;i<=b;i++){
result*=a;
}
System.out.println(result);
}
}

