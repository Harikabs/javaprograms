import java.util.*;
public class CalculateSeries{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
double result=0;
int n=sc.nextInt();
for (int i=1;i<=n;i++){
result+=1.0/i;
}
System.out.println(result);
}
}
