//program for swapping of three variables
import java.util.*;
public class Swap_Three_numbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(" enter the numbers:");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
x=x+y+z;
y=x-(y+z);
z=x-(y+z);
x=x-(y+z);
System.out.println(" swapped  numbers are:("+x+","+y+","+z+")");
}
}
 
