import java.util.*;
public class CountZeros{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int zeros=0;
int pos=0;
int neg=0;
do{
System.out.print("enter the number");
int n=sc.nextInt();
if(n==0)
zeros++;
if(n<0)
pos++;
if(n>0)
neg++;
System.out.println("if you want to  enter another number:");
char ch=sc.next().charAt(0);
if(ch=='n'||ch=='N')
break;
}
while(true);
System.out.println("zeros:"+ zeros );
System.out.println("negatives:"+neg);
System.out.println("positives:"+pos);
}
}



