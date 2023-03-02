import java.util.*;
public class Cube{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for (int i=1;i<=n;i++){
int cube=i*i*i;
System.out.println("the cube of number is "+cube);
}
}
}
