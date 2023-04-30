import java.util.*;
public class AlphabetPattern1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int n=sc.nextInt();
int alphabet=65;
for(int i=1;i<=n;i++){
for(int j=0;j<=i;j++){
System.out.print((char)(alphabet)+" ");
alphabet++;
}
System.out.println();
}
}
}


