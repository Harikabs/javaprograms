//program  having O(n!) time complexity 
import java.util.*;
public class N_Factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int j=0;j<n;j++){
for(int i=n;i>=j;i--){
System.out.println(i+" "+j);
}
}
}
}
