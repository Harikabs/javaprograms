import java.util.*;
public class Armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,arm=0,rem,c;
System.out.println("enter the number");
n=sc.nextInt();
c=n;
while(n>0){
rem=n%10;
arm=arm+(rem*rem*rem);
n=n/10;
}
if(c==arm){
System.out.println("armstrong");
}
else{
System.out.println("not armstrong");
}
}
}

