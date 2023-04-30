import java.util.*;
public class MulTable{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number for the table:");
int n=sc.nextInt();
for (int i=1;i<=10;i++){
for(int j=1;j<=n;j++){
int x=i*j;
System.out.print(i+"x"+j+"="+x+",");
}
System.out.println("");
}
}
}
