//program for String manipulation
import java.util.*;
import java.util.Arrays;
public class String_Manipulation{
public static void main(String args[]){
String S1="harika";
String S2="harika";
String S3="hari";
System.out.println(S1.compareTo(S2));
System.out.println(S1.length());
System.out.println(S1.charAt(3));
System.out.println(S1.equals(S2));
System.out.println(S1.contentEquals("hari"));
System.out.println(S1.contains("hari"));
System.out.println(S1.endsWith(""));
System.out.println(S3.concat(S2));
}
}


