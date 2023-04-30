import java.util.*;
public class Hcf{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int hcf=0;
System.out.println("enter the first number:");
int a=sc.nextInt();
System.out.println("enter the second number:");
int b=sc.nextInt();
for (int i=1;i<=a||i<=b;i++){
if (a%i==0&&b%i==0)
hcf=i;
}
System.out.println("hcf of the number:"+ hcf);
}
}


