import java.util.*;
public class Table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number for the table:");
int n=sc.nextInt();
for (int i=1;i<=10;i++){
int x=n*i;
System.out.println(n+"x"+i+"="+x);
}
}
}
