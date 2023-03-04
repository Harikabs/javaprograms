import java.util.*;
public class AddSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
do{
System.out.println("enter the  first number");
int a=sc.nextInt();
System.out.println("enter the  second number");
int b=sc.nextInt();
System.out.println(a+b);
System.out.println("if you want to add again:");
char ch=sc.next().charAt(0);
if(ch=='y'||ch=='Y')
continue;
else
return;
}while(true);
}
}



