import java.util.*;
public class FloyidsTriangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int n=sc.nextInt();
int s=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(s+" ");
s++;
}
System.out.println();
}
}
}

