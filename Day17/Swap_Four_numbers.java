//program for swapping of four variables
import java.util.*;
public class Swap_Four_numbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(" enter the numbers:");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int v=sc.nextInt();
x=x+y+z+v;
y=x-(y+z+v);
z=x-(y+z+v);
v=x-(y+z+v);
x=x-(y+z+v);
System.out.println(" swapped  numbers are:("+x+","+y+","+z+","+v+")");
}
}
 
