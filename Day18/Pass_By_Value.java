//program for showing passby value using method
import java.util.*;
public class Pass_By_Value{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("eneter the numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
add(a,b);
}
static void add(int a,int b){
System.out.println(a+b);
}
}

