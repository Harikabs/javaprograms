//program for multiplication table 
import java.util.*;
public class Table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int input=sc.nextInt();
while(input>1){
System.out.println("enter the positive number:");
}
for(int i=1;i<=10;i++){
System.out.println(i+"*"+input+"="+i*input);
}
}
}
