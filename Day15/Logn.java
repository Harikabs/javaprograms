//program  having O(log n) time complexity 
import java.util.*;
public class Logn{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=0;i<n;i+=3)
System.out.println(i);
}
}

