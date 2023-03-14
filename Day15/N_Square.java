//program  having O(n**2) time complexity 
import java.util.*;
public class N_Square{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
System.out.println(i);
}
}
}
