import java.util.*;
public class CalculateSeries1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
double result=0;
int n=sc.nextInt();
for (int i=1;i<=n;i++){
if(i%2==0)
result+=-1.0/i;
else
result+=1.0/i;
}
System.out.println(result);
}
}
