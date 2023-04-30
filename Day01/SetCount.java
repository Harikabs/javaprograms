import java.util.*;
public class SetCount{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int mask=1;
for (int i=0;i<32;i++){
if((n&mask)!=0)
    count++;
    mask<<=1;
    }
 System.out.println(count);
 }
 }
 
       

