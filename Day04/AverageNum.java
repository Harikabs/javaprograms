import java.util.*;
public class AverageNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter the 10 numbers");
for (int i=1;i<=10;i++){
int n=sc.nextInt();
sum=sum+n;
}
float avg=sum/10;
System.out.println("the sum of the number is:"+sum);
System.out.println("the Average of the number is:"+avg);
}
}
