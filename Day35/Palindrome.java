//program for checking given string is palindrome or not using recursion
public class Palindrome{
public static void main(String args[]){
String str="huh";
System.out.print(palindromeString(str));
}
public static boolean palindromeString(String str){
if((str.length()==0)||(str.length()==1))
return true;
if(str.charAt(0)==str.charAt(str.length()-1))
return palindromeString(str.substring(1,str.length()-1));
return false;
}
}

