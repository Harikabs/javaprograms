import java.util.*;
public class Pow2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int count=0;
int mask=1;
for (int i=0;i<32;i++){
if((n&mask)!=0)
    count++;
    mask<<=1;
    }
    if (count==1){
 System.out.println("it is a power of 2");
 }
 else{
 System.out.println("it is not apower of 2");
 }
 }
 }
    
