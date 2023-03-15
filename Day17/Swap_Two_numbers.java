//program for swapping of two varibles
import java.util.*;
public class Swap_Two_numbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(" enter the numbers:");
int x=sc.nextInt();
int y=sc.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println(" swapped  numbers are:("+x+","+y+")");
}
}
 
