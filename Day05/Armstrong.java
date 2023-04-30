import java.util.*;
public class Armstrong{
public static void main(String args[]){
for(int i=0;i<=500;i++){
int n,arm=0,rem,c;

n=i;
c=n;
while(n>0){
rem=n%10;
arm=arm+(rem*rem*rem);
n=n/10;
}
if(i==arm)
System.out.println(i);
}
}
}

