import java.util.*;
public class Cosx{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=7;
int x=90;
double x1=x*(3.14159265359)/180.0;
double result=0;
int sign=1;
for(int i=1,j=0;i<=n;i++,j+=2){
result+=(sign*Math.pow(x1,j))/fact(j);
sign*=-1;
}
System.out.println(Math.round(result));
}
static int fact(int n){
     int res=1;
     for(int i=1;i<=n;i++)
       res=res*i;
        return res;
        }
        }
        

