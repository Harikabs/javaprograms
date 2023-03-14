//program  having O(n**m) time complexity 
import java.util.*;
import java.lang.Math;
public class O_N_Power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=0;i<Math.pow(n,m);i++)
System.out.println(i);
}
}

