import java.util.*;
public class MinMax{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int n;
char ch;
do{
System.out.print("enter the number:");
n=sc.nextInt();
if(n>max){
max=n;
}
if(n<min){
min=n;
}
System.out.println("do you want to continue:");
ch=sc.next().charAt(0);
if(ch=='n'||ch=='N');
break;
}
while(true);
System.out.println(max);
System.out.println(min);
}
}
 
 
 
 
