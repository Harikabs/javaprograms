//program for implementing  fibonacci using recursion
public class fibonacci{
public static void main(String args[]){
int sum=9;
for(int i=0;i<sum;i++){
System.out.println(fibo(i)+" ");
}
}
public static int fibo(int n){
if(n==0)
return 0;
if(n==1||n==2)
return 1;
return fibo(n-1)+fibo(n-2);
}
}



