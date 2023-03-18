//program for showing stringpool and string 
import java.util.*;
import java.util.Arrays;
public class Str{
public static void main(String args[]){
String s="hello";
String s2=s;
String str=new String("harika");
System.out.println(str.hashCode());
System.out.println(s.hashCode());
System.out.println(s2.hashCode());
char arr[]={'h','a','r','i','k','a'};
System.out.println(Arrays.toString(arr));


}
}
