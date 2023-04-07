//program for checking the given two string anagram or not
import java.util.Arrays;
public class Anagram{
public static void main(String args[]){
String str1="Road";
String str2="Dora";
if(str1.length()==str2.length()){
str1=str1.toLowerCase();
str2=str2.toLowerCase();
char x[]=str1.toCharArray();
char y[]=str2.toCharArray();
Arrays.sort(x);
Arrays.sort(y);
boolean res=Arrays.equals(x,y);
if(res)
System.out.println("anagram");
else
System.out.println(" not a anagram");
}
else
{
System.out.println(" not a anagram");
}
}
}
