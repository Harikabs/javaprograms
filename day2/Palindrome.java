import java.util.*;
public class Palindrome{
public static void main(string args[]){
Scanner sc=new Scanner(System.in);
int r,sum=0;
int n=sc.nextInt();
int temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum){
System.out.println("palindrome");
}
else{
System.out.println(" not palindrome");
}
}
}

